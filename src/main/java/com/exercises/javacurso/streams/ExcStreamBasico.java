package com.exercises.javacurso.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExcStreamBasico {

    public static void main(String[] args) {

        /*of(), permite crear un arreglo que por detras se esta convirtiendo con Arrays.stream a un flujo*/
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pipo");

        /*Operadores:
         * - intermedio: para realizar transformaciones
         * - finales: para realizar alguna accion*/
        nombres.forEach(System.out::println);
        System.out.println("-------------------------------------");
        String[] arr = {"Pato", "Paco", "Pepa", "Pipo"};
        Stream<String> nombreAnimals = Arrays.stream(arr);
        nombreAnimals.forEach(System.out::println);

        System.out.println("------------------Crear por StringBuilder-------------------");

        Stream<String> nombres2 = Stream.<String>builder()
                .add("Luna")
                .add("luca")
                .add("lula").build();
        nombres2.forEach(System.out::println);

        System.out.println("------------------Crear por un Tipo Collection-------------------");

        List<String> lista = new ArrayList<>();
        lista.add("Caro");
        lista.add("Curo");
        lista.add("Cira");
//        Stream<String> nombresLista = lista.stream();
        lista.stream().forEach(System.out::println);

    }

}
