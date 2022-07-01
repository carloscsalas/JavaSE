package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class ExcFlatMap {

    public static void main(String[] args) {

        Stream<Usuario> objectNombre = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos", "Pepa Campel")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    //se tiene que retornar el objeto, pero no como uno normal q se maneja
                    //devuelve otro stream, tiene una entra y varias salidas
                    if (u.getNombre().equals("Pepa")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

//            objectNombre.forEach(System.out::println);
        System.out.println(objectNombre.count());

    }

}
