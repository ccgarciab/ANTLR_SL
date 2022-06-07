# An interpreter for the SL language, made with ANTLR

In this project we are building an interpreter for the SL programming lenguaje.

[Repository](https://github.com/ccgarciab/ANTLR_SL)

## Contents

### grammar

* SL.g4: where you can find our declaration of SL grammar

### src

* Funcion: classes to represent user defined and built-in functions and subroutines
* Tipo: Classes to represent diferent SL types
* Valor: classes to represent runtime values
* Visitors: Classes that act on parsee trees to compile functions to objects, or to execute functions

### gen

* the generated lexing/parsing code that allows further interpreting

### lib

* The antlr 4 runtime required to run the interpreter

## Executing

* Add the antlr runtime as an external library to your project
* Execute main
* Pass the source code to be executed via stdin

## Authors:

* [Catalina Aldana](https://github.com/catalina14)
* [Cristian Garcia](https://github.com/ccgarciab)
* [Santiago Hernandez](https://github.com/sanhernandezmon)
* [Diego Velasquez](https://github.com/arvelasquezva)