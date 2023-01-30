package com.exercises.javase.parsejson;

import com.fasterxml.jackson.core.type.TypeReference;

public class mainParseJson {

    public static void main(String[] args) {

        String jsonModeloCalculoTasa = "{\n" +
                "\t\"listCalculoTasa\": [{\n" +
                "\t\t\"codigo\": 10,\n" +
                "\t\t\"tipo\": \"prestamo\",\n" +
                "\t\t\"tasa\": 5,\n" +
                "\t\t\"entidad\": \"BBVA\"\n" +
                "\t}]\n" +
                "}";

        EnabledCalculoTasaDTO modeloCalculoTasa = BeanJacksonUtil.deserializeJson(jsonModeloCalculoTasa,
                new TypeReference<EnabledCalculoTasaDTO>() {
                });

        System.out.println(modeloCalculoTasa);
    }

}
