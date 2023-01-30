package com.exercises.javase.exercise;

import com.exercises.javase.entity.Customer;
import org.springframework.cglib.core.Local;
import org.springframework.util.StringUtils;

import javax.jws.soap.SOAPBinding;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

public class Fecha {

    public static void main(String[] args) {

        Customer customer = new Customer();
        String date = "2021-05-15";
        String date1 = "2021/05/15";
        String FORMATO = "yyyy-MM-dd";

        LocalDate localD = LocalDate.parse(date);
        System.out.println("LocalDate parse "+localD);
        LocalDate localDate1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("ofPattern yyyy/MM/dd "+localDate1);

        String dateLocal = localDate1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("String "+dateLocal);

        String dateLo =  localDate1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("LocalDate pase DateTimeFormatter "+dateLo);
        System.out.println("===============DDMMYY=================");

        String dateLoDDMMYY =  LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println("===DDMMYY=== "+dateLoDDMMYY);

        System.out.println("================================");
        LocalDate localDat = LocalDate.now();
        System.out.println(localDat);
        String date12 =  localDat.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println("LocalDate now: "+date12);
        System.out.println(".........................");
        String frmDate = "21/07/22";
        LocalDate localDateSw = LocalDate.parse(frmDate, DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println("-----localDateSw: "+localDateSw);

        System.out.println("::::::::::hora:::::::::::::-");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: "+localDateTime);
        System.out.println(localDateTime.getHour()+":"+localDateTime.getMinute());

        System.out.println("=============DATE::::::::::");
        Date date2 = new Date();
        System.out.println(date2.toString());
        DateFormat formato = new SimpleDateFormat("yyyy/mm/dd");
        formato.format(date2);

        System.out.println("::::::::::::::::::::::::::LOCALDATE ::::::::::::");
        String strDate =  "2021-07-20T17:10:00.000-0500".substring(0,10);
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.parse(strDate, dateformat);
        String fec = ld.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Fecha :"+fec);
        LocalDateTime ldt = LocalDateTime.of(ld, LocalDateTime.now().toLocalTime());
        LocalDate date22 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(ldt);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        String fech = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(fech);

//        customer.setCodigo(1L);
//        customer.setNombre("Luz");
////        customer.setFecha_nacimiento(localD);
//
//        customer.setFecha_nacimiento(LocalDate.parse(localDate.format(DateTimeFormatter.ofPattern(FORMATO))));
//        customer.setSueldo(15.20);
//
//        System.out.println(customer);

        System.out.println(":::::::::LOCALDATE STRING");
        System.out.println(LocalDateTime.now());

        System.out.println(":::::::::::::::::::::::::");

        String anio =  String.valueOf(LocalDate.now().getYear()).substring(0,2);
        System.out.println(anio);
        String sDate = "210520";
        System.out.println("-----------------");
        String sanio = sDate.substring(0,2);
        String smes = sDate.substring(2,4);
        String sdia = sDate.substring(4,6);
        System.out.println(smes+ " "+sdia);

        LocalDate loc = LocalDate.of(Integer.parseInt("2021"),12,21);
        System.out.println(loc);

        LocalDate localDateNew = LocalDate.parse(sDate, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println("::::::::::::=================::::::::::::::::::::");
        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);
        String dateTimeStr = LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
        String strDateFor = dateTimeStr.replace("T"," ");
        System.out.println(strDateFor);
        System.out.println(LocalDateTime.now());

        System.out.println("====================lastDate========================");
        String dateCor = "20221018";
        LocalDate localDateMod = LocalDate.of(Integer.parseInt(dateCor.substring(0,4)),
                Integer.parseInt(dateCor.substring(4,6)),Integer.parseInt(dateCor.substring(6,8)));
        LocalDate dateNow = LocalDate.of(2022,10,18);

        Integer compVal = localDateMod.compareTo(dateNow);

        String dateS = localDateMod.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(dateS);

        String dateyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println("dateyyMMdd:: "+dateyyMMdd);
        System.out.println(compVal);
        System.out.println(localDateMod);


    }
}
