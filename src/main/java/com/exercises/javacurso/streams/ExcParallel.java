package com.exercises.javacurso.streams;

import com.exercises.javacurso.streams.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ExcParallel {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernandez"));
        lista.add(new Usuario("Frecia", "Martel"));
        lista.add(new Usuario("Paola", "Torres"));
        lista.add(new Usuario("Angel", "Alvarado"));
        lista.add(new Usuario("Angel", "Rojas"));

        /*permite ejecutar los datos de forma paralela*/

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(u ->{
                    System.out.println("Nombre Thread: "+ Thread.currentThread().getName()+", Usuario: "+u);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (nombre.contains("angel".toUpperCase())){
                        return Stream.of(nombre);
                    }else{
                        return Stream.empty();
                    }
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: "+ (t2-t1));
        System.out.println(resultado);
    }
}
