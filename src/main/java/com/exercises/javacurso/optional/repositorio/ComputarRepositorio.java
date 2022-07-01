package com.exercises.javacurso.optional.repositorio;

import com.exercises.javacurso.optional.models.Computador;
import com.exercises.javacurso.optional.models.Fabricante;
import com.exercises.javacurso.optional.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputarRepositorio implements Repositorio<Computador>{

    private List<Computador> dataSource;

    public ComputarRepositorio() {
        dataSource = new ArrayList<>();
        Procesador prc = new Procesador("I9-9803h", new Fabricante("AMD"));
        Computador asus = new Computador("Asus ROG", "Strix G512");
        asus.setProcesador(prc);
        Computador mac = new Computador("MacBook Pro", "MVKC001");
        dataSource.add(asus);
        dataSource.add(mac);

    }

    @Override
    public Optional<Computador> filtrar(String nombre) {

//        for (Computador c: dataSource){
//            if (c.getNombre().equalsIgnoreCase(nombre)){
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();

         return dataSource.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre)).findFirst();
    }
}
