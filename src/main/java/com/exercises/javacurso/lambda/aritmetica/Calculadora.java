package com.exercises.javacurso.lambda.aritmetica;


import java.util.function.BiFunction;

public class Calculadora {

    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);
    }

    /*Esto que lo he realizado, es muy parecido a biFunctional, por ejm*/

    public double computarBiFunction(double a, double b, BiFunction<Double, Double, Double> biFunction){
        return biFunction.apply(a, b);
    }

}
