package com.exercises.javase.arreglos;

import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;

public class Bloque01 {

    public static void main(String[] args) {

        //Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden:
        //el primero, el ultimo, el segundo, el penultimo, el tercero, etc
//        int[] numeros = new int[6];
//
//        for (int i=0; i<6; i++){
//            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero: "));
//            numeros[i] = numero;
//        }
//
//        System.out.println("El resultado es: ");
//        for (int i=0; i<3; i++){
//
//            System.out.print(numeros[i]);
//            System.out.print(numeros[numeros.length-1-i]);
//        }

        //Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la
        //forma: el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc
//        int[] arregloA = new int[10];
//        int[] arregloB = new int[10];
//        int[] arregloC = new int[20];
//        for (int i =0; i<=9; i++){
//            arregloA[i] = (int)Math.round(Math.random()*(10-1)+1);
//            System.out.print("A: "+arregloA[i]+" - ");
//        }
//        System.out.println();
//        for (int i =0; i<=9; i++){
//            arregloB[i] = (int)Math.round(Math.random()*(10-1)+1);
//            System.out.print("B: "+arregloB[i]+" - ");
//        }
//
//        int j =0;
//        for (int i = 0; i <= 9; i++){
//            arregloC[j] = arregloA[i];
//            j++;
//            arregloC[j] = arregloB[i];
//            j++;
//        }
//        System.out.println();
//        Iterator<Integer> intIterator = Arrays.stream(arregloC).iterator();
//        intIterator.forEachRemaining(n -> System.out.print(n));

        //Mezclar 2 arreglos en una tercera, tomando 3 elementos de cada arreglo
        int[] arregloA = new int[12];
        int[] arregloB = new int[12];
        int[] arregloC = new int[24];


        for(int i = 0; i <= 11; i++){
            arregloA[i] = (int)Math.round(Math.random()*(10-1)+1);
            System.out.print("A:"+arregloA[i]+" - ");
        }
        for(int i = 0; i <= 11; i++){
            arregloB[i] = (int)Math.round(Math.random()*(10-1)+1);
            System.out.print("B:"+arregloB[i]+" - ");
        }


        int j = 0;
        for (int i =0; i<=11; i++){
            for (int x=0; x<3; x++) {
                arregloC[j] = arregloA[i+x];
                j++;
            }
            for (int y=0; y<3; y++) {
                arregloC[j] = arregloB[i+y];
                j++;
            }
            i+=3;
        }
        System.out.println(":::::::RESULTADO:::::");

        for (int n: arregloC) {
            System.out.print(n);
        }
    }
}
