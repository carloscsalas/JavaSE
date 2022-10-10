package com.exercises.javase.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExcObjects {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(5);
        listInt.add(9);
        Map<String,Object> mapList = new HashMap<>();
        mapList.put("listInt",listInt);
        mapList.put("valString","Valor-test");

        Object objMap = mapList;
        System.out.println(objMap);
        System.out.println("---------------");
        Map<String,Object> mapListConv = (Map<String,Object>)objMap;
        System.out.println(mapListConv.get("listInt"));
        System.out.println(mapListConv.get("valString"));

        List<Integer> listInt2 = new ArrayList<>();
        List<Integer> listInt3 = new ArrayList<>();

        List<Integer> resultList = Stream.concat(listInt2.stream(),listInt3.stream()).collect(Collectors.toList());
        System.out.println(resultList);

    }
}
