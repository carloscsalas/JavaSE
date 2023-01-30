package com.exercises.javase.exercise;

import org.springframework.batch.item.file.transform.DefaultFieldSet;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcRegex {

    public static void main(String[] args) {

        List<String> listStr = new ArrayList<>();
//        listStr.add("{1:F21BCONPEP0BXXX3521035112}{4:{177:250220909BCONPEP0BXXX02030037012209092250N}{4:");
        listStr.add(":60F:C220909MXN1,");
        listStr.add(":60M:C220909MXN1,");
        listStr.add(":62F:C220909MXN1,");
        listStr.add(":62M:C220909MXN1,");
        listStr.add(":64:C220909MXN1,");
        listStr.add("-}{5:{CHK:9445F6FBF29D}{TNG:}{PDE:}}");

        for (String str : listStr){
            if (Pattern.compile("^:60F:").matcher(str).find() || Pattern.compile("^:60M:").matcher(str).find()){
                System.out.println("SIXTY F");
            }
            if (Pattern.compile("^:64:").matcher(str).find()){
                System.out.println("SIXTYFOUR");
            }
            if (Pattern.compile("^:62F:").matcher(str).find() || Pattern.compile("^:62M:").matcher(str).find()){
                System.out.println("SIXTYTWO F");
            }
            if (Pattern.compile("^-}\\{5:").matcher(str).find()){
                System.out.println("FIVE");
            }
        }
        System.out.println("::::::*****************::::::");

        String[] split = "aaalid$oopm".split("\\$");
        System.out.println(split.length);
        String val1 = split[0];
        System.out.println(val1);
        String val2 = split[1];
        System.out.println(val1+"-"+val2);

        String cero = "0 00NNB                        0000000000000000000";
        String uno = "  10NNB 11120101            PEN2208310000100100001";
        String dos = " 20NNB 11120101            PEN22083100001001";

        List<String> listStr2 = new ArrayList<>();
        listStr2.add(cero);
        listStr2.add(uno);
        listStr2.add(dos);

        String valNumcero = String.valueOf(cero.charAt(2));
        System.out.println("valNumcero:: "+valNumcero);
        String valNumuno = String.valueOf(uno.charAt(2));
        System.out.println("valNumuno:: "+valNumuno);

        for (String str : listStr2){
            if (Pattern.compile("^  0").matcher(str).find()){
                System.out.println("CERO");
            }
            if (Pattern.compile("^  1").matcher(str).find()){
                System.out.println("UNO");
            }
            if (Pattern.compile("^  2").matcher(str).find()){
                System.out.println("DOS");
            }
        }

        String subtL = "aaXxxxcDaqt";
        System.out.println("SUBST::::::::");
        System.out.println(subtL.substring(0,5));
        System.out.println(subtL.substring(6,10));

        System.out.println(":::::::::::::::");
        FieldSet fieldSet = new DefaultFieldSet(new String[] { "This is some dummy string", "true", "C" }, new String[] { "varString", "varBoolean", "varChar" });

        System.out.println("fieldset:: "+fieldSet.readString("varBoolean"));

        /**
        FixedLengthTokenizer tokenizer = new FixedLengthTokenizer();
        String[] names = new String[] { "ISIN", "Quantity", "Price", "Customer" };
        Range[] ranges = new Range[] { new Range(1, 12), new Range(13, 15), new Range(16, 20), new Range(21, 29) };
        tokenizer.setColumns(ranges);
        tokenizer.setNames(names);
        FieldSet fieldSet1 = tokenizer.tokenize("ESECTado  da25015225GINOFEMIR");
        System.out.println(fieldSet1);
        */

        FixedLengthTokenizer tokenizer = new FixedLengthTokenizer();
//        String[] names = new String[] { "id","accountSource","movementSourceDescription","accountNumber","currencyId","releaseDate","registryNumber","pageNumber","counter","close","closeSign","availableBalance","availableSign","transactionMessage" };
        String[] names = new String[] { "id","accountSource","movementSourceDescription","accountNumber","currencyId","releaseDate","registryNumber","pageNumber","counter","close","closeSign","availableBalance","availableSign","transactionMessage"};
//        Range[] ranges = new Range[] { new Range(1, 3), new Range(5), new Range(6,7), new Range(9,28), new Range(29,31), new Range(32,37), new Range(38,42), new Range(43,45), new Range(46,49), new Range(51,68),new Range(69),new Range(102,119),new Range(120),new Range(121,170) };
        Range[] ranges = new Range[] { new Range(1, 3), new Range(5,5), new Range(6,7), new Range(9,28), new Range(29,31), new Range(32,37), new Range(38,42), new Range(43,45), new Range(46,49), new Range(51,68),new Range(69,69),new Range(102,119),new Range(120,120),new Range(121,170)};
        tokenizer.setColumns(ranges);
        tokenizer.setNames(names);
        tokenizer.setStrict(false);
        FieldSet fieldSet1 = tokenizer.tokenize("  30NNB 112401010201        USD2208310000100100003000004593848794900D                                000000000000000000");

        System.out.println(fieldSet1);
    }
}
