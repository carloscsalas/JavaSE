package com.exercises.patronesdisenio.decorator;

//objeto al que queremos modificar

public class Texto implements Formateable{
    private String texto;

    public Texto(String texto){
        this.texto = texto;
    }

    @Override
    public String darFormato() {
        return getTexto();
    }

    public String getTexto() {
        return texto;
    }
}
