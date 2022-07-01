package com.exercises.javacurso.streams;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ExcStreamInfinitoGenerate {

    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);

        /*generate(), genera en un bucle infinito "Hola Mundo", hasta que lo detengamos
        * limit(), limita la cantidad de registros que se requiera*/

        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return contador.getAndIncrement();
                })
                .limit(5)
                .forEach(System.out::println);


    }

}
