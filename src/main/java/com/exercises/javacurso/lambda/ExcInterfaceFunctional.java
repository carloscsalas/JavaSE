package com.exercises.javacurso.lambda;

import com.exercises.javacurso.lambda.aritmetica.Aritmetica;
import com.exercises.javacurso.lambda.aritmetica.Calculadora;

public class ExcInterfaceFunctional {

    public static void main(String[] args) {
        /*No es necesario implementar el metodo realizar la operacion, tdo se maneja en la expresion lambda*/
        Aritmetica suma = (a , b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        /*Esto que lo he realizado, es muy parecido a biFunctional*/

        System.out.println(cal.computar(10, 4, suma));
        System.out.println(cal.computar(10, 4, resta));
        /*se implementa el metodo al vuelo*/
        System.out.println(cal.computar(10, 5, (a, b)-> a * b));

        System.out.println("::::::::::BiFunction::::::::::::");
//        System.out.println(cal.computarBiFunction(8, 4, (a, b)-> a + b));
        System.out.println(cal.computarBiFunction(8, 4, Double::sum));


    }
}
