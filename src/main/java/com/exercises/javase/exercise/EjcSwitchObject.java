package com.exercises.javase.exercise;

public class EjcSwitchObject {


    public static void main(String[] args) {

        Planta planta = new Planta("101","Eucalipto");
        Object objsPla = planta;
        Mamifero mamifero = new Mamifero("202", "Vaca");
        Object objsMam = mamifero;

        System.out.println("::objsMam getCanonicalName::"+objsMam.getClass().getCanonicalName());
        System.out.println("::objsMam getSimpleName::"+objsMam.getClass().getSimpleName());
        System.out.println("::Mamifero::"+Mamifero.class.getCanonicalName());
        System.out.println("::Mamifero getSimpleName::"+Mamifero.class.getSimpleName());


    }

}



class Planta{
    private String codigo;
    private String name;

    public Planta(String codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "codigo='" + codigo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Mamifero{
    private String codigo;
    private String name;

    public Mamifero(String codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "codigo='" + codigo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

