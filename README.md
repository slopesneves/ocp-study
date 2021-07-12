# writing main method
## compile and run main class
```
javac Main.java
java Main
```

output `main class method successfuly executed`

## to compile java code, file name must end with ".java"
`javac Main.notjava` output `error: Class names, 'Main.notjava', are only accepted if annotation processing is explicitly requested`

## name of the bytecode file match name of the class
* `javac MainFileWithDifferentClassName.java` output file `FileNameIsDifferent.class`
* `java FileNameIsDifferent` output `main file with different class name successfully executed`

## passing parameter
`javac PassingParameter.java` output file `PassingParameter.class`

`java PassingParameter merci "de rien"` output
```
success to execute main method with the following parameters
merci
de rien
```

## running file without compile it
`java RunWithoutCompilation.java` output `run in one line`