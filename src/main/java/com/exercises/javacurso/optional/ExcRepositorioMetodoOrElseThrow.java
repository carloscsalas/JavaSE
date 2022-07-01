package com.exercises.javacurso.optional;

import com.exercises.javacurso.optional.models.Computador;
import com.exercises.javacurso.optional.repositorio.ComputarRepositorio;
import com.exercises.javacurso.optional.repositorio.Repositorio;

import java.util.Optional;

public class ExcRepositorioMetodoOrElseThrow {

    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputarRepositorio();

//        Computador pc = repositorio.filtrar("asus rog2").orElseThrow(() -> new IllegalStateException());
        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains(".")) //si no encuentra nada, el optional va quedar vacio, y el map no se aplica
                .map(a -> a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow(IllegalStateException::new);

        System.out.println(extension);
    }

}
