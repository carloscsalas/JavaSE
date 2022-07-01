package com.exercises.javacurso.optional;

import com.exercises.javacurso.optional.models.Computador;
import com.exercises.javacurso.optional.repositorio.ComputarRepositorio;
import com.exercises.javacurso.optional.repositorio.Repositorio;

import java.util.concurrent.atomic.AtomicReference;

public class ExcRepositorio {

    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputarRepositorio();

//        Optional<Computador> pc = repositorio.filtrar("asus r");
//
//        if (pc.isPresent()){
//            System.out.println(pc.get().getNombre());
//        }else{
//            System.out.println("No se encontro");
//        }
        /*:::::::::::::::::::::::::::::::::::::*/
        String n = null;
        repositorio.filtrar("asus rg").ifPresent(System.out::println);

    }
}
