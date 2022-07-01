package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExcMapAndPeek {
    public static void main(String[] args) {

        /*
        map: para manipular, modificar. tiene una entrada y devuelve una única salida
        peek: para inspeccionar, para mirar; casi como un debug. Como un foreach pero se ejecuta como intermedio*/

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pipo")
                .peek(System.out::println)
                .map(String::toUpperCase);

        /*aca el operador final, el foreach, gatilla el stream anterior, si no se tiene el peek no muestra nada */
        nombres.forEach(System.out::println);

//        Stream.of("Pato", "Paco", "Pepa", "Pipo")
//                .map(String::toUpperCase).forEach(System.out::println);

        /**/
        System.out.println("-----------Convertir el stream a un tipo list---------------");

        Stream<String> nombres2 = Stream.of("Pato", "Paco", "Pepa", "Pipo")
                .peek(System.out::println)
                .map(String::toUpperCase);
        /*el collect es un operador final, si lo ejecuto se va pintar lo puesto en el peek*/
        List<String> list = nombres2.collect(Collectors.toList());

        System.out.println("---------------Convertir objeto---------------");

        Stream<Usuario> objectNombre = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getNombre()))
                .map(usuario -> {
                    usuario.setNombre(usuario.getNombre().toLowerCase());
                    return usuario;
                });

        List<Usuario> listaUsuario = objectNombre.collect(Collectors.toList());
//        listaUsuario.forEach(usuario -> System.out.println(usuario.getApellido()));
        listaUsuario.forEach(System.out::println);
//        System.out.println("--------------");
//        objectNombre.forEach(System.out::println);

    }
}
