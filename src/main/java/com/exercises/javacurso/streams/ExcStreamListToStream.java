package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExcStreamListToStream {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernandez"));
        lista.add(new Usuario("Frecia", "Martel"));
        lista.add(new Usuario("Paola", "Torres"));
        lista.add(new Usuario("Angel", "Alvarado"));
        lista.add(new Usuario("Angel", "Rojas"));

//        lista.stream().map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
//                .flatMap(nombre -> {
//                    if (nombre.contains("angel".toUpperCase())){
//                        return Stream.of(nombre);
//                    }else{
//                        return Stream.empty();
//                    }
//                })
//                .map(String::toLowerCase)
//                .forEach(System.out::println);

        lista.stream()
                .map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("angel".toUpperCase())){
                        return Stream.of(nombre);
                    }else{
                        return Stream.empty();
                    }
                })
                .map(String::toLowerCase)
                .forEach(System.out::println);


    }

}
