package com.exercises.patronesdisenio.singleton;

import com.exercises.patronesdisenio.singleton.SingletonBDConexion;

public class SingletonEjemplo {

    public static void main(String[] args) {
        /*Patron que crea una instancia*/

        SingletonBDConexion con = null;
        for (int i=0; i< 10; i++){
            con= SingletonBDConexion.getInstancia();
            System.out.println("con = "+ con);
        }
        SingletonBDConexion con2 = SingletonBDConexion.getInstancia();
        SingletonBDConexion con3 = SingletonBDConexion.getInstancia();

        boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));

            System.out.println("b1 = "+b1);

    }
}
