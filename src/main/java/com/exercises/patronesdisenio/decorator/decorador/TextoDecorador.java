package com.exercises.patronesdisenio.decorator.decorador;

import com.exercises.patronesdisenio.decorator.Formateable;

//decorador padre
/*el decorador debe anidar o envolver al componente para que lo pueda decorar*/
public abstract class TextoDecorador implements Formateable {

    //tiene que ser formateable porque no solo podriamos tener un texto del objeto que
    //queremos decorar si no tambien podria tener otros decoradores y de esa forma poder
    //mantener el decorador anterior y darle una funcionalidad estra de forma recursiva
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
