package com.exercises.javase.ordenamiento;

import javax.swing.*;

public class MetodosOrdenamiento {

    public static void main(String[] args) {

//        int nElementos, aux;
//
//        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de elementos del array: "));
//
//        int[] arreglo = generarNumerosAleatorio(nElementos, 10);

//        for(int i=0; i<(nElementos-1);i++){
//            for (int j=0; j<(nElementos-1); j++){
//                if(arreglo[j]>arreglo[j+1]){
//                    aux = arreglo[j];
//                    arreglo[j] = arreglo[j+1];
//                    arreglo[j+1]= aux;
//                }
//            }
//        }
//
//        //Mostrar el arreglo ordenado en forma creciente
//        System.out.println("Arreglo ordenado en forma creciente::");
//        for (int i=0; i<nElementos; i++){
//            System.out.print(arreglo[i]+" - ");
//        }
//
//        System.out.println("::::::::::::::::::::::::::::::::::::");
//        System.out.println("Arreglo ordenado en forma decreciente");
//        for (int i= (nElementos-1); i>=0; i--){
//            System.out.print(arreglo[i]+" ");
//        }
//        String cadena = ",Asasas";
//        System.out.println(cadena.substring(1));

        /*ORDEN POR INSERCION*/

        int nElementos, pos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de elementos del array: "));

        int[] arreglo = generarNumerosAleatorio(nElementos, nElementos);
        for (int n: arreglo ) {
            System.out.print(n);
        }
        System.out.println("-----------------");
        for (int i= 0; i<nElementos; i++){
            pos = i;
            aux = arreglo[i];
//            while (pos != 0){
//                if (aux < arreglo[pos-1]){
//                    arreglo[pos] = arreglo[pos-1];
//                    arreglo[pos-1] = aux;
//
//                }
//                pos--;
//            }
            while (pos > 0 && (arreglo[pos-1]> aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("----------------");
        for (int n : arreglo) {
            System.out.print(n+" ");
        }

    }

    public static int[] generarNumerosAleatorio(int tamanio, int cantidad){
        int[] nArray = new int[tamanio];
        int n = 0;
        while (n < cantidad){
            nArray[n] = (int)Math.round((Math.random()*(10-1)+1));
            n++;
        }
        return nArray;
    }

}
