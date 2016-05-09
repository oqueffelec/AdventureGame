srcpath=./src/fr/insarouen/asi/prog/feux_a_trous
srctestpath=./srctest/fr/insarouen/asi/prog/feux_a_trous
sources=Main.java


	if [ "$1" = "clean" ]; then
		rm -rf classes/*
		rm -rf classestest/*
	else
			echo 'Compiling ...'
			rm -rf classes/*
			rm -rf classestest/*
			javac -classpath ./classes -sourcepath ./src -d ./classes $srcpath/$sources
			if [ $? -eq 0 ]; then
				echo '...success !'
				echo 'running ...'
				java -classpath classes fr.insarouen.asi.prog.feux_a_trous.Main
			else
				echo "OMFG! ERROR!"
			fi
		fi
fi
