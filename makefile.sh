srcpath=./src/fr/insarouen/asi/prog/asiaventure
sources=Main.java

echo 'compiling ...'
javac -classpath ./classes -sourcepath ./src -d ./classes $srcpath/$sources
echo '...success !'

echo 'running ...'
java -classpath classes fr.insarouen.asi.prog.asiaventure.Main