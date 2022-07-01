package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExcSumAndMapToInt {

    public static void main(String[] args) {

        /*MapInt*/

        IntStream largoNombres = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Paco Arias",
                        "Paco Arias", "Paco Arias")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .peek(System.out::println)
                        .mapToInt(u -> u.getNombre().length());

//        largoNombres.forEach(System.out::println);
//        System.out.println("total de digitos: "+largoNombres.sum());  //sum, es un terminar
//        System.out.println("maximo: "+largoNombres.max().getAsInt()); //max, igual es un terminal, tengo q comentar el sum
        IntSummaryStatistics stats = largoNombres.summaryStatistics(); //sumary.. es un terminal pero me da la opcion de realizar luego varias operaciones
        System.out.println("total :"+ stats.getSum());
        System.out.println("maximo :"+ stats.getMax());
        System.out.println("promedio :"+ stats.getAverage());

    }
}
