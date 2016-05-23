srcpath=./src/fr/insarouen/asi/minigimp
sources=MiniGimp.java


echo 'Compiling ...'
			rm -rf classes/*
			javac -classpath ./classes -sourcepath ./src -d ./classes $srcpath/$sources
			if [ $? -eq 0 ]; then
				echo '...success !'
				echo 'running ...'
				java -classpath classes fr.insarouen.asi.minigimp.MiniGimp
			else
				echo "OMFG! ERROR!"
			fi

