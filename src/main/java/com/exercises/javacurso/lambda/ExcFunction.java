package com.exercises.javacurso.lambda;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ExcFunction {


    public static void main(String[] args) {
        /*Esta expresion recibe un argumento como parametro y tambien devuelve un valor*/
//        Function<String, String> f1 = param -> {
//            return "hola que tal "+ param;
//        };
        Function<String, String> f1 = param -> "hola que tal "+ param;
        String resultado = f1.apply("Gino");
        System.out.println(resultado);

        System.out.println("--------Referencia de metodo---------");

//        Function<String, String> f2 = param -> param.toUpperCase();
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Todo llega en algun momento"));

        System.out.println(":::::::::::::BiFunction::::::::::::");
        BiFunction<String, String, String> biFunction = (a , b) -> a.toUpperCase().concat(b.toUpperCase());
        String resulBi = biFunction.apply("Todo termina ", "en algun momento");
        System.out.println(resulBi);

//        BiFunction<String, String, Integer> biFunctionInt = (a, b) -> a.compareTo(b);
        BiFunction<String, String, Integer> biFunctionInt = String::compareTo;
        System.out.println(biFunctionInt.apply("gino","gino"));

        System.out.println("::::::::::::EJERCICIO:::::::::");
        Function<String, String[]> functionArray = data ->  data.split(" ");

        Map<String, Integer> mapWord = new HashMap<>();

        int i =1;
        for (String word: functionArray.apply("que tengan que un buen dia hoy dia")) {
                if (mapWord.containsKey(word)){
                    mapWord.put(word, mapWord.get(word)+1);
                    i++;
                }else {
                    mapWord.put(word, 1);
                }
        }
        mapWord.forEach((x , y) -> System.out.println("Palabra: ".concat(x).concat(", Valor: ").concat(y.toString())));

    }
}
