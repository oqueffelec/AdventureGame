srcpath=./src
sources=Main.java

if [ "$1" = "doc" ]; then
	javadoc $srcpath/*.java -d doc
else
	if [ "$1" = "clean" ]; then
		rm -rf classes/*
		else
			echo 'Compiling ...'
			javac -classpath ./classes -sourcepath ./src -d ./classes $srcpath/$sources
			if [ $? -eq 0 ]; then
				echo '...success !'
				echo 'running ...'
				java -classpath classes Main $1
			else
				echo "OMFG! ERROR!"
			fi
		fi
	fi
