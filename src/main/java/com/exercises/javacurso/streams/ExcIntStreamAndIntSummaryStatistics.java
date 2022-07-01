package com.exercises.javacurso.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ExcIntStreamAndIntSummaryStatistics {

    public static void main(String[] args) {

        System.out.println("::::::::::::::::::::IntStream - Range:::::::::::::::::");

//        IntStream intStream = IntStream.range(5, 20) //
        /*incluye el ultimo argumento*/
        IntStream intStream = IntStream.rangeClosed(5, 20)
                .peek(System.out::println);
//        Integer resultRange = intStream.reduce(0, Integer::sum);
        Integer resulNum = intStream.sum();
        System.out.println(resulNum);

        System.out.println("==============IntSummaryStatistics============");
        //del resultado, podemos obtener varios datos de estadistica
        IntStream intStatistcs = IntStream.range(5, 20);

        IntSummaryStatistics statistics = intStatistcs.summaryStatistics();
        System.out.println("max: "+statistics.getMax());
        System.out.println("min: "+statistics.getMin());
        System.out.println("promedio: "+statistics.getAverage());
        System.out.println("suma: "+statistics.getSum());

    }
}
