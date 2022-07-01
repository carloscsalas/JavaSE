package com.exercises.javase.exercise;

import org.springframework.util.StringUtils;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaMatch {
    public static void main(String[] args) {

        Integer lenght = 7;
//        String val1 = "7774638DS";
//        String val2 = "DW7774638";
//
//        Integer firPo = 1;
//        String firForm = "XXXXXXX";
//        Integer secPo = 3;
//        String secForm = "XXXXXXX";
        /** *2
        String val1 = "W7774638DS";
        Integer firPo = 2;
        String firForm = "XXXXXXX";

        String val2 = "7774638WAS";
        Integer secPo = 1;
        String secForm = "XXXXXXX";*/

        /** *1
        String resultVal = formatReferencia(lenght, val2, secPo, secForm);
        System.out.println(":::resultVal::::"+resultVal);*/


//        if (secForm.contains("-")){
//            Integer pos = secForm.indexOf("-");
////
////            System.out.println("ubicacion: "+pos);
////            System.out.println("(secPo-1)+pos: "+((secPo-1)+pos));
////            System.out.println("resta: "+(lenght-pos));
//            String resV2 = val2.substring(secPo-1, (secPo-1)+pos).concat(val2.substring((secPo)+pos,((secPo)+pos)+(lenght-pos)));
//            System.out.println("result:: "+resV2);
//        }else{
////            String resV1 = val1.substring(firPo-1,(firPo-1)+lenght);
////            System.out.println("VAL1:::"+resV1);
//            String resV2 = val2.substring(secPo-1, (secPo-1)+lenght);
//            System.out.println("VAL2:::"+resV2);
//        }

        String operativeType = "Our-Our";
        String val1 = "W7774638DS";
        Integer firPo = 1;
        String firForm = "XXXXXXX";
        String origenUno = "V";
        String val2 = "7774638WAS";
        Integer secPo = 3;
        String secForm = "XXXXXXX";
        String origenDos = "N";

        List<Movimiento> listMovNos = getListMonNos();
        List<Movimiento> listMovVos = getListMonVos();

//        String[] arrayType = operativeType.split("-");

        List<Metodo> lisMethod = getListMetodo();

        for (Metodo met: lisMethod){
            String[] arrayType = met.getOperationType().split("-");

            if (arrayType[0].equalsIgnoreCase("Our")){
                getMethodVostro(met, "V", "N", arrayType[1], "Our", listMovVos, listMovNos, lenght);
                getMethodVostro(met, "V", "N", arrayType[1], "Their", listMovVos, listMovNos, lenght);

            }
            if (arrayType[0].equalsIgnoreCase("Their")){
                getMethodVostro(met, "V", "N", arrayType[1], "Their", listMovVos, listMovNos, lenght);
                getMethodVostro(met, "V", "N", arrayType[1], "Our", listMovVos, listMovNos, lenght);

            }
        }



        System.out.println("::::::::::::::::::::::DISTINCT::::::::::::");

        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Animal();
        animal.setTipo("1");
        animal.setDescripcion("Gusano");
        Animal animal2 = new Animal();
        animal2.setTipo("1");
        animal2.setDescripcion("Gusano");
        Animal animal3 = new Animal();
        animal3.setTipo("1");
        animal3.setDescripcion("Gusano");
        Animal animal4 = new Animal();
        animal4.setTipo("2");
        animal4.setDescripcion("Vaca");
        Animal animal5 = new Animal();
        animal5.setTipo("2");
        animal5.setDescripcion("Vaca");
        animalList.add(animal);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        Animal an = new Animal();

        List<Animal> formatoAni =  animalList.stream().distinct().collect(Collectors.toList());
        System.out.println("===========");

        List<String> animalStr = new ArrayList<>();
        List<Animal> animalObj = new ArrayList<>();
        for (Animal aniFor : animalList){
            if (!animalStr.contains(aniFor.getTipo())){
                animalStr.add(aniFor.getTipo());
                animalObj.add(aniFor);
            }
        }
        animalStr.forEach(System.out::println);
        animalObj.forEach(System.out::println);
        System.out.println("::::::::::::::");



    }

    public static void getMethodVostro(Metodo met, String oriMethodFir, String oriMethodSec, String oriTable, String oriDev, List<Movimiento> listMovOne, List<Movimiento> listMovSec, Integer lenght){

        if (met.getOriginOne().equalsIgnoreCase(oriMethodFir)){
            for (Movimiento mvo : listMovOne){

                //getMethodNostro(oriTable, oriDev, oriMethodSec, met, listMovSec, mvo, lenght);

                getMethodNostro(oriTable, oriDev, oriMethodSec, met, listMovSec, mvo, lenght);

            }
        }
    }

    public static void getMethodNostro(String oriTable, String oriDev, String oriMethod, Metodo met, List<Movimiento> listMovSec, Movimiento movFir, Integer lenght){
        if (oriTable.equalsIgnoreCase(oriDev)) {
            if (met.getOriginTwo().equalsIgnoreCase(oriMethod)){
                for (Movimiento mno : listMovSec) {
                    String result1 = getFormatReferencia(lenght, movFir.getReferenciaOur(),  met.getPositionOne(), met.getFormatOne());
                    String result2 = getFormatReferencia(lenght, mno.getReferenciaOur(), met.getPositionTwo(), met.getFormatTwo());
                    if (getFormatReferencia(lenght, movFir.getReferenciaOur(),  met.getPositionOne(), met.getFormatOne()).equalsIgnoreCase(getFormatReferencia(lenght, mno.getReferenciaOur(), met.getPositionTwo(), met.getFormatTwo()))){
                        System.out.println(":::MATCHING STAR:::");
                        System.out.println("Position 1="+met.getPositionOne()+":::"+" Format 1="+ met.getFormatOne());
                        System.out.println("Position 2="+met.getPositionTwo()+":::"+" Format 2="+ met.getFormatTwo());

                        System.out.println(movFir.getCodigo()+"::"+movFir.getReferenciaOur()+":::"+result1);
                        System.out.println(mno.getCodigo()+"::"+mno.getReferenciaOur()+":::"+result2);
                        System.out.println(":===MATCHING END====:");
                    }
                }
            }
        }
    }


    public static String getFormatReferencia(Integer length, String val, Integer post, String format){
        String response = "";
        if (format.contains("-")){
            Integer pos = format.indexOf("-");
//
//            System.out.println("ubicacion: "+pos);
//            System.out.println("(secPo-1)+pos: "+((secPo-1)+pos));
//            System.out.println("resta: "+(lenght-pos));
            response = val.substring(post-1, (post-1)+pos).concat(val.substring((post)+pos,((post)+pos)+(length-pos)));
         //  System.out.println("result:: "+response);
        }else{
//            String resV1 = val1.substring(firPo-1,(firPo-1)+length);
//            System.out.println("VAL1:::"+resV1);
            response = val.substring(post-1, (post-1)+length);
           // System.out.println("VAL2:::"+response);
        }
        return response;
    }

    public static List<Metodo> getListMetodo(){
        List<Metodo> listMetodo = new ArrayList<>();
        Metodo metodo = new Metodo();
        metodo.setOperationType("Our-Our");
        metodo.setPositionOne(1);
        metodo.setFormatOne("XXXXXXX");
        metodo.setOriginOne("V");
        metodo.setPositionTwo(3);
        metodo.setFormatTwo("XXXXXXX");
        metodo.setOriginTwo("N");

        Metodo metodoTwo = new Metodo();
        metodoTwo.setOperationType("Our-Our");
        metodoTwo.setPositionOne(1);
        metodoTwo.setFormatOne("XXXXXXX");
        metodoTwo.setOriginOne("V");
        metodoTwo.setPositionTwo(5);
        metodoTwo.setFormatTwo("XXXXXXX");
        metodoTwo.setOriginTwo("N");
        listMetodo.add(metodo);
        listMetodo.add(metodoTwo);

        return listMetodo;
    }

    public static List<Movimiento> getListMonVos(){
        List<Movimiento> listMov = new ArrayList<>();
        Movimiento movimiento = new Movimiento();
        movimiento.setCodigo("1");
        movimiento.setOrigen("S");
        movimiento.setReferenciaTheir("1234567XCDS");
        movimiento.setReferenciaOur("1234567XCDSASW");
        Movimiento movimiento2 = new Movimiento();
        movimiento2.setCodigo("3");
        movimiento2.setOrigen("S");
        movimiento2.setReferenciaTheir("7654321XCDSASS");
        movimiento2.setReferenciaOur("1234567XCDSSAS");
        Movimiento movimiento3 = new Movimiento();
        movimiento3.setCodigo("5");
        movimiento3.setOrigen("S");
        movimiento3.setReferenciaTheir("654321XCDSSEW");
        movimiento3.setReferenciaOur("123456XCDSSASA");
        Movimiento movimiento4 = new Movimiento();
        movimiento4.setCodigo("7");
        movimiento4.setOrigen("S");
        movimiento4.setReferenciaTheir("7412589XCDSAS");
        movimiento4.setReferenciaOur("712589XCDSVCDS");
        listMov.add(movimiento);
        listMov.add(movimiento2);
        listMov.add(movimiento3);
        listMov.add(movimiento4);
        return listMov;
    }

    public static List<Movimiento> getListMonNos(){
        List<Movimiento> listMov = new ArrayList<>();
        Movimiento movimiento = new Movimiento();
        movimiento.setCodigo("2");
        movimiento.setOrigen("N");
        movimiento.setReferenciaTheir("1234567XCDSAS");
        movimiento.setReferenciaOur("OP1234567XCDSSS");
        Movimiento movimiento2 = new Movimiento();
        movimiento2.setCodigo("4");
        movimiento2.setOrigen("N");
        movimiento2.setReferenciaTheir("1234567XCDSRT");
        movimiento2.setReferenciaOur("OPER1234567XCDSEW");
        Movimiento movimiento3 = new Movimiento();
        movimiento3.setCodigo("6");
        movimiento3.setOrigen("N");
        movimiento3.setReferenciaTheir("123456XCDSVC");
        movimiento3.setReferenciaOur("123456XCDSYTE");
        Movimiento movimiento4 = new Movimiento();
        movimiento4.setCodigo("8");
        movimiento4.setOrigen("N");
        movimiento4.setReferenciaTheir("7412589XCDSER");
        movimiento4.setReferenciaOur("7412589XCDSNBD");
        listMov.add(movimiento);
        listMov.add(movimiento2);
        listMov.add(movimiento3);
        listMov.add(movimiento4);
        return listMov;
    }
}

class Animal {
    private String tipo;
    private String descripcion;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
                .add("tipo='" + tipo + "'")
                .add("descripcion='" + descripcion + "'")
                .toString();
    }
}

class Movimiento {

    String codigo;
    String referenciaTheir;
    String referenciaOur;
    String referenciaNarr;
    String moneda;
    String origen;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getReferenciaTheir() {
        return referenciaTheir;
    }

    public void setReferenciaTheir(String referenciaTheir) {
        this.referenciaTheir = referenciaTheir;
    }

    public String getReferenciaOur() {
        return referenciaOur;
    }

    public void setReferenciaOur(String referenciaOur) {
        this.referenciaOur = referenciaOur;
    }

    public String getReferenciaNarr() {
        return referenciaNarr;
    }

    public void setReferenciaNarr(String referenciaNarr) {
        this.referenciaNarr = referenciaNarr;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movimiento.class.getSimpleName() + "[", "]")
                .add("codigo='" + codigo + "'")
                .add("referenciaTheir='" + referenciaTheir + "'")
                .add("referenciaOur='" + referenciaOur + "'")
                .add("referenciaNarr='" + referenciaNarr + "'")
                .add("moneda='" + moneda + "'")
                .add("origen='" + origen + "'")
                .toString();
    }
}

class Metodo{
    String operationType;
    Integer positionOne;
    String formatOne;
    String originOne;
    Integer positionTwo;
    String formatTwo;
    String originTwo;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integer getPositionOne() {
        return positionOne;
    }

    public void setPositionOne(Integer positionOne) {
        this.positionOne = positionOne;
    }

    public String getFormatOne() {
        return formatOne;
    }

    public void setFormatOne(String formatOne) {
        this.formatOne = formatOne;
    }

    public String getOriginOne() {
        return originOne;
    }

    public void setOriginOne(String originOne) {
        this.originOne = originOne;
    }

    public Integer getPositionTwo() {
        return positionTwo;
    }

    public void setPositionTwo(Integer positionTwo) {
        this.positionTwo = positionTwo;
    }

    public String getFormatTwo() {
        return formatTwo;
    }

    public void setFormatTwo(String formatTwo) {
        this.formatTwo = formatTwo;
    }

    public String getOriginTwo() {
        return originTwo;
    }

    public void setOriginTwo(String originTwo) {
        this.originTwo = originTwo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Metodo.class.getSimpleName() + "[", "]")
                .add("operationType='" + operationType + "'")
                .add("positionOne=" + positionOne)
                .add("formatOne='" + formatOne + "'")
                .add("originOne='" + originOne + "'")
                .add("positionTwo=" + positionTwo)
                .add("formatTwo='" + formatTwo + "'")
                .add("originTwo='" + originTwo + "'")
                .toString();
    }
}