package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExcAnyMatchAndCount {

    public static void main(String[] args) {

        boolean existe = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos", "Pipo Azar")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(usuario -> usuario.getId().equals(2));

        System.out.println(existe);

        System.out.println("================Esto se haria sin anyMatch=============");

//        List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Torres"),
//                new Usuario("Paco","Arias"), new Usuario("Pepa","Campel"),
//                new Usuario("Pipo","Ostos"), new Usuario("Pipo","Azar"));
//
//        boolean resultado = false;
//        for (Usuario usu : lista){
//            if (usu.getId().equals(3)){
//                resultado = true;
//                break;
//            }
//        }
//        System.out.println(resultado);

        System.out.println(":::::::::::::::::::::Count::::::::::::::::::::::::::::");

        long count = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos", "Pipo Azar")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

        System.out.println("================filtrar cadena vacia y sumarlos==================");
        long countn = Stream.of("Pato Torres", " ", "Pepa Campel", "Pipo Ostos","")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = "+countn);

    }
}
