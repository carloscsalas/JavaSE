package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class ExcFilter {

    public static void main(String[] args) {

        System.out.println("================obtener una lista==================");
        Stream<Usuario> objectNombre = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pato"))
                .peek(System.out::println);

//        List<Usuario> listaUsuario = objectNombre.collect(Collectors.toList());
//        listaUsuario.forEach(System.out::println);

        System.out.println("=============Obtener un solo objeto y probando el Optional================");
        //findFirst, es un operador final
        Optional<Usuario> usuarioOptional = objectNombre.findFirst();
//        System.out.println("Obj: "+usuarioOptional.orElse(new Usuario("Ana","Montes")).getNombre());
//        System.out.println("Obj: "+usuarioOptional.orElseGet(() -> new Usuario("Ana","Montes")).getNombre());
//        System.out.println("Obj: "+usuarioOptional.orElseThrow(() -> new RuntimeException("No se encontro usuario")).getNombre());
        if (usuarioOptional.isPresent()) {
            System.out.println(usuarioOptional.get());
        }else{
            System.out.println("No se encontro usuario");
        }
        System.out.println("==============Obtener un solo objeto V2==============");

//        Usuario obtUsuariov2 = Stream.of("Pato Torres", "Paco Arias", "Pepa Campel", "Pipo Ostos", "Pipo Azar")
//                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
//                .peek(System.out::println)
//                .filter(u -> u.getId().equals(3))
//                .findFirst().get();
//
//        System.out.println(obtUsuariov2);
    }

}
