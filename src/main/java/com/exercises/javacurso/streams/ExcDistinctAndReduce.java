package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExcDistinctAndReduce {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos",
                "Paco Arias", "Paco Arias")
                .distinct();

        nombres.forEach(System.out::println);

        System.out.println("::::::::::::::::Object Usuario::::::::::::::::::");
        Stream<Usuario> nombresUsuario = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos",
                        "Paco Arias", "Paco Arias")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct(); //se implemento el equals en el entity, para que no considere en la igualdad al id


        nombresUsuario.forEach(System.out::println);

        /*reduce, reducir el flujo de varios elementos en uno solo*/
        System.out.println("::::::::::::::::::::::Reduce:::::::::::::::::::::");

        Stream<String> nombresStream = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos",
                        "Paco Arias", "Paco Arias")
                .distinct();

        String resultado = nombresStream.reduce("Nombres ",(a , b)-> a+", "+b);
        System.out.println(resultado);

        System.out.println("===============Con valores Numericos===============");
        Stream<Integer> enteros = Stream.of(15, 16, 25, 99, 6, 16)
                .distinct();

//        Integer resulInt = enteros.reduce(0, (x, z) -> x +z);
//        Integer resulInt = enteros.reduce(0, (x, z) -> Integer.sum(x,z));
        Integer resulInt = enteros.reduce(0, Integer::sum);
        System.out.println(resulInt);


    }

}
