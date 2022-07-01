package com.exercises.patronesdisenio.decorator;

import com.exercises.patronesdisenio.decorator.decorador.MayusculaDecorador;
import com.exercises.patronesdisenio.decorator.decorador.ReversaDecorador;
import com.exercises.patronesdisenio.decorator.decorador.SubrayadoDecorador;

public class MainDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal todos");

        MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversaDecorador);

        System.out.println(subrayar.darFormato());
    }
}
