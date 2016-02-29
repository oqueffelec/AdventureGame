srcpath=./src/fr/insarouen/asi/prog/asiaventure
sources=Main.java

if [ "$1" = "doc" ]; then
	javadoc $srcpath/*.java $srcpath/elements/*.java $srcpath/elements/structure/*.java $srcpath/elements/objets/*.java -d doc
else
	if [ "$1" = "clean" ]; then
		rm -rf classes/fr/*
	else
		if [ "$1" = "tests" ]; then
			javac -cp /classes/junit-4.12.jar -sourcepath ./src -d ./classes ./src/tests/TestMonde.java
			echo 'hello ...'
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
