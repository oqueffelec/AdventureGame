srcpath=./src/fr/insarouen/asi/prog/asiaventure
srctestpath=./srctest/fr/insarouen/asi/prog/asiaventure
sources=Main.java

if [ "$1" = "doc" ]; then
	javadoc $srcpath/*.java $srcpath/elements/*.java $srcpath/elements/structure/*.java $srcpath/elements/objets/*.java -d doc
else
	if [ "$1" = "clean" ]; then
		rm -rf classes/*
		rm -rf classestest/*
	else
		if [ "$1" = "tests" ]; then
			test=$2".java";
			echo 'compiling ...'
			javac -cp ./classes:lib/* -sourcepath ./src:./srctest -d ./classestest $srctestpath/$test
			if [ $? -eq 0 ]; then
				echo '...success !'
				echo 'running ...'
				java -classpath classestest:classes:lib/* org.junit.runner.JUnitCore fr.insarouen.asi.prog.asiaventure.TestMonde
			else
				echo "OMFG! ERROR!"
			fi
		else
			echo 'Compiling ...'
			javac -classpath ./classes -sourcepath ./src -d ./classes $srcpath/$sources
			if [ $? -eq 0 ]; then
				echo '...success !'
				echo 'running ...'
				java -classpath classes fr.insarouen.asi.prog.asiaventure.Main
			else
				echo "OMFG! ERROR!"
			fi
		fi
	fi
fi
