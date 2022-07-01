package com.exercises.javase.exercise;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosPrueba {

    public static void main(String[] args) {
//        int num = Integer.parseInt(args[0]);
//        System.out.println(num);
        String cadena = "hola world";

//        List<String> datos = new ArrayList<>();
//        String num_cuenta="";
//        for (int i=0; i < 5 ; i++){
//            for (int x = 0; x< 20; x++){
//                num_cuenta = num_cuenta+(int)Math.round(Math.random()*(10-1));
//            }
//            datos.add(num_cuenta);
//            num_cuenta="";
//        }
//
//        datos.stream().forEach(System.out::println);
//        System.out.println("---------------");
//
//        System.out.println(num_cuenta);
//        System.out.println("/////////////////////////////////");
//
//        String num_proc="PRO";
//        for (int x = 0; x< 7; x++){
//            num_proc = num_proc+(int)Math.round(Math.random()*(10-1));
//        }
//        System.out.println(num_proc);
//        System.out.println(":::::::::::::::::::::::::::::::::");
//        account acc = new account();
//        acc.setDescripcion("ESTA BIEN");
//        acc.setNombre("OK");

        List<Account> listAccount = new ArrayList<>();
        List<Movement> listMovement = new ArrayList<>();;
        Cabecera cabecera = null;
        BalanceClose balanceClose = null;
        BalanceOpen balanceOpen = null;
        Movement movement = null;
        Account account = null;
        for (Nostro nostro : getListNostro()){

            if (nostro.getId().equals("0")){
                account = new Account();
                cabecera = new Cabecera();
                cabecera.setCa_descripcion(nostro.getCa_descripcion());
                cabecera.setCa_nombre(nostro.getCa_nombre());
                account.setCabecera(cabecera);
            }
            if (nostro.getId().equals("1")){
                listMovement = new ArrayList<>();
                balanceOpen = new BalanceOpen();
                balanceOpen.setBo_codigo(nostro.getBo_codigo());
                balanceOpen.setBo_descripcion(nostro.getBo_descripcion());
                account.setBalanceOpen(balanceOpen);
            }
            if (nostro.getId().equals("2")){
                movement = new Movement();
                movement.setNum_account(nostro.getMonto());
                movement.setCode(nostro.getReferencia());
                listMovement.add(movement);
            }

            if (nostro.getId().equals("3")){
                account.setListMovement(listMovement);
                balanceClose = new BalanceClose();
                balanceClose.setBc_codigo(nostro.getBc_codigo());
                balanceClose.setBc_descripcion(nostro.getBc_descripcion());
                account.setBalanceClose(balanceClose);
                System.out.println("::::::ACCOUNT:::::");
                System.out.println("::: "+account);
                listAccount.add(account);
            }

        }



    }

    public static List<Nostro> getListNostro(){
        List<Nostro> nostroList = new ArrayList<>();
        Nostro nostro = new Nostro();
        nostro.setId("0");
        nostro.setCa_descripcion("cxxxxxxx");
        nostro.setCa_num_account("1022222152125215215");
        nostro.setCa_nombre("cx");
        Nostro nostro2 = new Nostro();
        nostro2.setId("1");
        nostro2.setNombre("BBVA");
        nostro2.setBo_codigo("1002D");
        nostro2.setBo_descripcion("APERTURA 1");
        Nostro nostro3 = new Nostro();
        nostro3.setId("2");
        nostro3.setNombre("BBVA");
        nostro3.setMonto("222225.05");
        nostro3.setReferencia("AAAAA");
        Nostro nostro4 = new Nostro();
        nostro4.setId("2");
        nostro4.setNombre("BBVA");
        nostro4.setMonto("333620.36");
        nostro4.setReferencia("VVVVVVV");
        Nostro nostro5 = new Nostro();
        nostro5.setId("2");
        nostro5.setNombre("BBVA");
        nostro5.setMonto("3666.39");
        nostro5.setReferencia("WWWWWW");
        Nostro nostro6 = new Nostro();
        nostro6.setId("3");
        nostro6.setBc_codigo("BC2225");
        nostro6.setBc_descripcion("CIERRE 1");

        Nostro nostro7 = new Nostro();
        nostro7.setId("1");
        nostro7.setBo_codigo("22002D");
        nostro7.setBo_descripcion("APERTURA 2");
        Nostro nostro8 = new Nostro();
        nostro8.setId("2");
        nostro8.setNombre("BBVA");
        nostro8.setMonto("6666666.66");
        nostro8.setReferencia("CCCCCCCCC");
        Nostro nostro9 = new Nostro();
        nostro9.setId("3");
        nostro9.setBc_codigo("BC2225");
        nostro9.setBc_descripcion("CIERRE 1");

        nostroList.add(nostro);
        nostroList.add(nostro2);
        nostroList.add(nostro3);
        nostroList.add(nostro4);
        nostroList.add(nostro5);
        nostroList.add(nostro6);
        nostroList.add(nostro7);
        nostroList.add(nostro8);
        nostroList.add(nostro9);
        return nostroList;
    }
}

class Nostro{
    private String id;
    private String nombre;
    private String referencia;
    private String monto;
    private String ca_num_account;
    private String ca_nombre;
    private String ca_descripcion;
    private String bo_codigo;
    private String bo_descripcion;
    private String bc_codigo;
    private String bc_descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCa_num_account() {
        return ca_num_account;
    }

    public void setCa_num_account(String ca_num_account) {
        this.ca_num_account = ca_num_account;
    }

    public String getCa_nombre() {
        return ca_nombre;
    }

    public void setCa_nombre(String ca_nombre) {
        this.ca_nombre = ca_nombre;
    }

    public String getCa_descripcion() {
        return ca_descripcion;
    }

    public void setCa_descripcion(String ca_descripcion) {
        this.ca_descripcion = ca_descripcion;
    }

    public String getBo_codigo() {
        return bo_codigo;
    }

    public void setBo_codigo(String bo_codigo) {
        this.bo_codigo = bo_codigo;
    }

    public String getBo_descripcion() {
        return bo_descripcion;
    }

    public void setBo_descripcion(String bo_descripcion) {
        this.bo_descripcion = bo_descripcion;
    }

    public String getBc_codigo() {
        return bc_codigo;
    }

    public void setBc_codigo(String bc_codigo) {
        this.bc_codigo = bc_codigo;
    }

    public String getBc_descripcion() {
        return bc_descripcion;
    }

    public void setBc_descripcion(String bc_descripcion) {
        this.bc_descripcion = bc_descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nostro{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", referencia='").append(referencia).append('\'');
        sb.append(", monto='").append(monto).append('\'');
        sb.append(", ca_num_account='").append(ca_num_account).append('\'');
        sb.append(", ca_nombre='").append(ca_nombre).append('\'');
        sb.append(", ca_descripcion='").append(ca_descripcion).append('\'');
        sb.append(", bo_codigo='").append(bo_codigo).append('\'');
        sb.append(", bo_descripcion='").append(bo_descripcion).append('\'');
        sb.append(", bc_codigo='").append(bc_codigo).append('\'');
        sb.append(", bc_descripcion='").append(bc_descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Account{
    private Cabecera cabecera;
    private BalanceOpen balanceOpen;
    private BalanceClose balanceClose;
    private List<Movement> listMovement;

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }

    public BalanceOpen getBalanceOpen() {
        return balanceOpen;
    }

    public void setBalanceOpen(BalanceOpen balanceOpen) {
        this.balanceOpen = balanceOpen;
    }

    public BalanceClose getBalanceClose() {
        return balanceClose;
    }

    public void setBalanceClose(BalanceClose balanceClose) {
        this.balanceClose = balanceClose;
    }

    public List<Movement> getListMovement() {
        return listMovement;
    }

    public void setListMovement(List<Movement> listMovement) {
        this.listMovement = listMovement;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("cabecera=").append(cabecera);
        sb.append(", balanceOpen=").append(balanceOpen);
        sb.append(", balanceClose=").append(balanceClose);
        sb.append(", listMovement=").append(listMovement);
        sb.append('}');
        return sb.toString();
    }
}

class Movement{

    private String code;
    private String num_account;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNum_account() {
        return num_account;
    }

    public void setNum_account(String num_account) {
        this.num_account = num_account;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movement{");
        sb.append("code='").append(code).append('\'');
        sb.append(", num_account='").append(num_account).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Cabecera{
    private String ca_nombre;
    private String ca_descripcion;

    public String getCa_nombre() {
        return ca_nombre;
    }

    public void setCa_nombre(String ca_nombre) {
        this.ca_nombre = ca_nombre;
    }

    public String getCa_descripcion() {
        return ca_descripcion;
    }

    public void setCa_descripcion(String ca_descripcion) {
        this.ca_descripcion = ca_descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cabecera{");
        sb.append("ca_nombre='").append(ca_nombre).append('\'');
        sb.append(", ca_descripcion='").append(ca_descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class BalanceOpen{
    private String bo_codigo;
    private String bo_descripcion;

    public String getBo_codigo() {
        return bo_codigo;
    }

    public void setBo_codigo(String bo_codigo) {
        this.bo_codigo = bo_codigo;
    }

    public String getBo_descripcion() {
        return bo_descripcion;
    }

    public void setBo_descripcion(String bo_descripcion) {
        this.bo_descripcion = bo_descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BalanceOpen{");
        sb.append("bo_codigo='").append(bo_codigo).append('\'');
        sb.append(", bo_descripcion='").append(bo_descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class BalanceClose{
    private String bc_codigo;
    private String bc_descripcion;

    public String getBc_codigo() {
        return bc_codigo;
    }

    public void setBc_codigo(String bc_codigo) {
        this.bc_codigo = bc_codigo;
    }

    public String getBc_descripcion() {
        return bc_descripcion;
    }

    public void setBc_descripcion(String bc_descripcion) {
        this.bc_descripcion = bc_descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BalanceClose{");
        sb.append("bc_codigo='").append(bc_codigo).append('\'');
        sb.append(", bc_descripcion='").append(bc_descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
