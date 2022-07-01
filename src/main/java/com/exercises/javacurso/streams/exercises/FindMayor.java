package com.exercises.javacurso.streams.exercises;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMayor {

    public static void main(String[] args) {

//        List<String> transactionsList = new ArrayList<>();
//        transactionsList.add("IS0867-04-211221");
//        transactionsList.add("IS0867-10-211221");
//        transactionsList.add("IS0867-02-211221");
//
//
//        String resultString = transactionsList.stream().
//                filter(ref -> {
//                    String[] vals = ref.split("-");
//                    boolean bool = false;
//                    if(Integer.parseInt(vals[1]) == transactionsList.stream().map(refint -> {
//                        String[] valsInt = refint.split("-");
//                        return Integer.parseInt(valsInt[1]);
//                    }).max(Comparator.naturalOrder()).get()){
//                        bool = true;
//                    }
//                    return bool;
//                }).findFirst().get();
//
//        System.out.println("RESULT resultString:: "+resultString);

        List<String> listNumReference = new ArrayList<>();
        listNumReference.add("0005");
        listNumReference.add("0012");
        listNumReference.add("0008");


        String lpath = String.format("%0"+listNumReference.stream().findFirst().get().length()+"d",
                listNumReference.stream().map(num -> Integer.parseInt(num)).max(Comparator.naturalOrder()).get());
        System.out.println("STRING FORMAT::: "+lpath);

    }
}
