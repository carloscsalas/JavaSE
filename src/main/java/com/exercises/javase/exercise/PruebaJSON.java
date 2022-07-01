package com.exercises.javase.exercise;

import org.json.JSONObject;

public class PruebaJSON {

    public static void main(String[] args) {

        JSONObject myObject = getJsonObject();

        System.out.println(":::::MYOBJECT::::");
        System.out.println(myObject);
        String jsonString = myObject.toString();
        System.out.println(":::::MYOBJECT-STRING:::: "+jsonString);

        JSONObject json_transform = new JSONObject(jsonString);
        System.out.println(":::::MYOBJECT TRANSFORMED::::");
        System.out.println(json_transform);
        System.out.println("NAME:::: "+json_transform.getString("name"));
    }


    public static JSONObject getJsonObject(){
        JSONObject myObject = new JSONObject();

        // Cadenas de texto básicas
        myObject.put("name", "Carlos");
        myObject.put("last_name", "Carlos");

        // Valores primitivos
        myObject.put("age", new Integer(21));
        myObject.put("bank_account_balance", new Double(20.2));
        myObject.put("is_developer", new Boolean(true));

        // Matrices
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        myObject.put("number_list", myList);

        // Objeto dentro de objeto
        JSONObject subdata = new JSONObject();
        myObject.put("extra_data", subdata);

        // Generar cadena de texto JSON
//        System.out.print(myObject);
        return myObject;
    }



}
