package com.exercises.javacurso.optional;

import com.exercises.javacurso.optional.models.Computador;
import com.exercises.javacurso.optional.models.Fabricante;
import com.exercises.javacurso.optional.models.Procesador;
import com.exercises.javacurso.optional.repositorio.ComputarRepositorio;
import com.exercises.javacurso.optional.repositorio.Repositorio;

import java.util.Optional;

public class ExcRepositorioMapFilter {

    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputarRepositorio();

//        Computador pc = repositorio.filtrar("asus rog2").orElseThrow(() -> new IllegalStateException());
//        Fabricante pc = repositorio.filtrar("asus rog")
//                        .map(Computador::getProcesador)
//                                .map(Procesador::getFabricante)
//                                        .orElseThrow(IllegalStateException::new);
//        System.out.println(pc);

        /*CON LOS GETTERS DEVOLVIENDO UN OBJETO NORMAL*/
//        String f = repositorio.filtrar("asus rog")
//                .map(Computador::getProcesador)
//                .map(Procesador::getFabricante)
//                .filter(fab -> fab.getNombre().equalsIgnoreCase("AMD"))
//                .map(Fabricante::getNombre)
//                .orElse("Desconocido");
//
//        System.out.println(f);

        /*CON GETTERS DEVOLVIENDO OPTIONAL*/
        /*cuando devuelve un optional, se utiliza el flatMap()*/
        String f = repositorio.filtrar("asus rog")
                //Cuando el metodo get o lo que retorna flatMap es un optional, se utiliza flatmap porque es del mismo tipo
                //del flujo de filtrar, que esta devolviendo un Optional. Si el get devuelve un objeto normal, utilizar map()
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> fab.getNombre().equalsIgnoreCase("AMD"))
                //aca utilizamos map(), porque el get devuelve un tipo String
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);

    }

}
