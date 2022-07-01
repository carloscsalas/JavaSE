package com.exercises.javacurso.optional;

import org.springframework.util.StringUtils;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExcOptional {

    public static void main(String[] args) {
        String nombre = "Gino";

        //of(), no acepta nulo
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt: "+opt);
        System.out.println(opt.isPresent());

        if (opt.isPresent()){
            System.out.println("Hola "+opt.get());
        }

//        opt.ifPresent(s -> System.out.println("Hola " + s));

        System.out.println("-----------------Manejando Null con Optional--------------------");
        nombre = null;

        opt = Optional.ofNullable(nombre);
        System.out.println("opt: "+opt);
        System.out.println(opt.isPresent());

        opt.ifPresent(v -> System.out.println(v));

        System.out.println("-------------optional vacio---------------------");
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty: "+ optEmpty);
        System.out.println(optEmpty.isPresent());



    }

}
