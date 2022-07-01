package com.exercises.patronesdisenio.singleton;

public class SingletonBDConexion {

    private static SingletonBDConexion instancia;

    private SingletonBDConexion(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    public static SingletonBDConexion getInstancia(){
        if (!(instancia instanceof SingletonBDConexion)){
            instancia = new SingletonBDConexion();
        }
        return instancia;
    }
}
