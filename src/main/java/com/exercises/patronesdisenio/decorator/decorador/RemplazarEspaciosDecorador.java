package com.exercises.patronesdisenio.decorator.decorador;

import com.exercises.patronesdisenio.decorator.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador{

    public RemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
