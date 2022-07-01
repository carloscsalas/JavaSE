package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Factura;
import com.exercises.javacurso.streams.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class ExcStreamFlatMapFactura {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Carlos", "Salas");
        Usuario u2 = new Usuario("Roberto", "Contreras");

        u1.addFactura(new Factura("compras tecnologicas"));
        u1.addFactura(new Factura("muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("laptops gamers"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
//
//        for (Usuario u: usuarios){
//            for (Factura f : u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }

        /*flatMap,  cada salida distinta se devuelve en un stream*/
//        usuarios.stream()
//                .map(Usuario::getFacturas)
//                .flatMap(List::stream)
//                .forEach(f -> System.out.println(f.getDescripcion().concat(" Cliente: ")
//                        .concat(f.getUsuario().getNombre())));

                usuarios.stream()
                        .flatMap(u -> u.getFacturas().stream())
                        .forEach(f -> System.out.println(f.getDescripcion().concat(" Cliente: ")
                        .concat(f.getUsuario().getNombre())));

    }

}
