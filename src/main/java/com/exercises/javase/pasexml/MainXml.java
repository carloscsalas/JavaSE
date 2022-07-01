package com.exercises.javase.pasexml;

import com.exercises.javase.pasexml.header.AppHdr;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.*;
import org.springframework.util.StringUtils;

public class MainXml {


    public static void main(String[] args) {
        String examplexml =                          //example xml
                "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                        "    <head:Fr>\n" +
                        "        <head:FIId>\n" +
                        "            <head:FinInstnId>\n" +
                        "                <head:BICFI>CIBCCATTXXX</head:BICFI>\n" +
                        "            </head:FinInstnId>\n" +
                        "        </head:FIId>\n" +
                        "    </head:Fr>\n" +
                        "    <head:To>\n" +
                        "        <head:FIId>\n" +
                        "            <head:FinInstnId>\n" +
                        "                <head:BICFI>CIBCCATTXXX</head:BICFI>\n" +
                        "            </head:FinInstnId>\n" +
                        "            <head:FinInstnId>\n" +
                        "                <head:BICFI>CIBCCATTYYY</head:BICFI>\n" +
                        "            </head:FinInstnId>\n" +
                        "        </head:FIId>\n" +
                        "    </head:To>\n" +
                        "    <head:BizMsgIdr>GGEWZRV14D</head:BizMsgIdr>\n" +
                        "    <head:MsgDefIdr>pacs.008.001.08</head:MsgDefIdr>\n" +
                        "    <head:Amt Ccy=\"USD\">10000</head:Amt>\n" +
                        "    <head:BizSvc>swift.cbprplus.01</head:BizSvc>\n" +
                        "    <head:CreDt>9999-12-31T00:00:00+00:00</head:CreDt>\n" +
                        "    <head:Prty>NORM</head:Prty>\n" +
                        "</head:AppHdr>";
//        System.out.println(examplexml); //printing Example of XML


        System.out.println("JSON IS");
        try
        {
//            StringUtils.replace(examplexml,"head:","");
            String replaceHead = examplexml.replace("head:", "");
            String replaceHead2= replaceHead.replace(":head", "");
            System.out.println("///////////////////");
            System.out.println(replaceHead2);
            System.out.println("///////////////////");
//            JSONObject json = XML.toJSONObject(replaceHead.replaceAll("[:head]", ":"));
            JSONObject json = XML.toJSONObject(replaceHead2);
            String jsonString = json.toString(4);
            System.out.println(jsonString);
            System.out.println("::::::::::::::::::::::::::::");
            Gson gson = new GsonBuilder().create();
            AppHdr appHdr = gson.fromJson(json.getJSONObject("AppHdr").toString(), AppHdr.class);
            System.out.println(":::::RESULT:::::::");
            System.out.println(appHdr);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
