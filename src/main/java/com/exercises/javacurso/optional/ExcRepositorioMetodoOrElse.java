package com.exercises.javacurso.optional;

import com.exercises.javacurso.optional.models.Computador;
import com.exercises.javacurso.optional.repositorio.ComputarRepositorio;
import com.exercises.javacurso.optional.repositorio.Repositorio;

public class ExcRepositorioMetodoOrElse {

    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputarRepositorio();

        String n = null;
//        Computador pc = repositorio.filtrar("asus rog").orElse(new Computador("HP Omen", "LA00DS1"));
        /*utilizando un metodo para obtener el objeto por defecto, en orElse, independiente si existe o no
        va invocar el metodo y el objeto por defecto se crea, si o si. Aunquen solo muestre cuando no coincida*/
        Computador pc = repositorio.filtrar("asus rog").orElse(valorPorDefecto());
        System.out.println(pc);

        System.out.println("==============orElseGet=============");
        //orElseGet, requiere una expresion lambda. Aca si no exite lo filtrado, no invoca el metodo y no crea el objeto
        pc = repositorio.filtrar("macbook pro").orElseGet(ExcRepositorioMetodoOrElse::valorPorDefecto);
        System.out.println(pc);
    }

    public static Computador valorPorDefecto(){
        System.out.println("::::::Obteniendo valor por defecto::::::");
        return new Computador("HP Omen", "LA00DS1");
    }
}
