package com.exercises.javase.bucles;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Bloque01 {

    public static void main(String[] args) {

        //Escribir todos los numeros del 100 al 0 de 7 en 7
//        for (int i=100; i >= 0; i-=7){
//            System.out.println(i);
//        }

        //Pedir 10 numeros y escribir la suma total
//        int numero, suma = 0;
//
//        for (int i=1; i<= 5; i++){
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
//            suma += numero;
//        }
//        System.out.println("La suma es: "+suma);

        //producto de numeros impares aleatoriamente
//        int result =1;
//        for (int i=1; i <= 30; i++){
//            Long nramdon = Math.round(Math.random()*(10-1)+1);
////            System.out.println(nramdon);
//            if (nramdon % 2 != 0){
//                result *= nramdon;
//                System.out.println(":::::: "+result);
//            }
//        }
//        System.out.println("RESULT: "+result);

        //producto de los 10 primeros numeros impares
//        long producto = 1;
//
//        for (int i=1; i<=20; i+=2){
//            producto *= i;
//        }
//        System.out.println("El producto es: "+producto);

//        int numeroSueldos;
//        float sueldo, sueldoMaximo = 0;
//        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de sueldos: "));
//
//        for (int i=1; i<numeroSueldos; i++){
//            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo N"+i+": "));
//
//            if (sueldo > sueldoMaximo){
//                sueldoMaximo = sueldo;
//            }
//        }
//        System.out.println("El sueldo maximo es: "+sueldoMaximo);

        //Leer por teclado una serie de 10 numeros enteros, indicar que los numeros estan ordenados de forma
        // creciente, decreciente, o si estan desordenados.
//        Integer[] arregloCreciente = {0,1,2,3,4,5,6,7,8,9};
//        Integer[] arregloDesordenad0 = {0,1,2,3,7,5,6,4,8,9};
//        Integer[] arregloDecreciente = {9,8,7,6,5,4,3,2,1,0};
//        Integer[] arregloIguales = {9,9,9,9,9,9,9,9,9};
//        boolean creaciente = false, decreciente = false;
//        int ncreciente = 0, ndecreciente = 0;
//
//        int d = 0;
////        int k = arregloDecreciente.length-1;
//        for (int n: arregloCreciente) {
////            if (n == d){
////                ncreciente++;
////            }
////            d++;
////            if (n == k){
////                ndecreciente++;
////            }
////            k--;
//            if(arregloCreciente[d] < arregloCreciente[d+1]){
//                creaciente = true;
//            }
//            if(arregloCreciente[d] > arregloCreciente[d+1]){
//                decreciente = true;
//            }
//        }
////        if(arregloDecreciente.length == ncreciente){
////            System.out.println("CRECIENTE");
////        }
////        if(arregloDecreciente.length == ndecreciente){
////            System.out.println("DECRECIENTE");
////        }
//        if(creaciente){
//            System.out.println("CRECIENTE");
//        }
//        if(decreciente){
//            System.out.println("DECRECIENTE");
//        }

        /*Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros.
         * Despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada desplazando los
         * que estan detras*/

//        int numero, posicion;
//
//        int[] nrandom = generarNumerosAleatorio(10,8);
//
//        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
//        posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion"));
//        System.out.println("Inicial - arreglo:::::::");
//        for (int n: nrandom
//        ) {
//            System.out.print(n+" ");
//        }
//
//        //Correr una posicion los elementos detras de la posicion indicada
//        for(int i=7; i>=posicion; i--){
//            nrandom[i+1] = nrandom[i];
//        }
//        nrandom[posicion] = numero;
//
//        System.out.println("Nuevo arreglo:::::::");
//        for (int n: nrandom
//             ) {
//            System.out.print(n+" ");
//        }

        /*Crear un programa que lea por teclado una tabla de 10 numeros enteros y la
        * desplace una posicion hacia abajo: el primero pasa a ser el segundo, el segundo
        * el tercero y asi sucesivamente hasta que el ultimo pase a ser el primero*/

//        int[] nrandom = generarNumerosAleatorio(10,10);
//        System.out.println("Inicial - arreglo:::::::");
//        for (int n: nrandom
//        ) {
//            System.out.print(n+" ");
//        }
//        System.out.println("Despues - arreglo:::::::");
////        int[] xrandom = new int[10];
////        for (int x = 9; x>=1; x--){
////            xrandom[x-1] = nrandom[x];
////        }
////        xrandom[xrandom.length-1] = nrandom[0];
//        int valor = nrandom[nrandom.length-1];
//
//        for (int i=8; i>=0; i--){
//            nrandom[i+1] = nrandom[i];
//        }
//        nrandom[0] = valor;
//        for (int n: nrandom
//        ) {
//            System.out.print(n+" ");
//        }

        /*Desplazar N posiciones un arreglo.(El anterior solo se desplazo una posicion)*/

//        int[] arreglo = generarNumerosAleatorio(10,10);
//        int n_posicion, ultimo;
//
//        System.out.println("Antes - arreglo:::::::");
//        for (int n: arreglo
//        ) {
//            System.out.print(n+" ");
//        }
//
//        n_posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de posiciones a desplazar:"));
//        for (int vuelta=1; vuelta <= n_posicion; vuelta++){
//            ultimo = arreglo[9];
//            for (int i=8;i>=0;i--){
//                arreglo[i+1] = arreglo[i];
//            }
//            arreglo[0] = ultimo;
//        }
//                System.out.println("Despues - arreglo:::::::");
//        for (int n: arreglo
//        ) {
//            System.out.print(n+" ");
//        }

        /*se debe ingresar  numeros en una arreglo ordenado crecientemente, y luego de ingresar ese numero el arreglo siga ordenado
        * en orden creciente*/

//        Scanner entrada = new Scanner(System.in);
//        int[] arreglo = new int[10];
//        boolean creciente = true;
//        int numero, sitio_numero=0, j=0;
//        System.out.println("Llenar el arreglo");
//
//        do{
//
//            for (int i = 0; i<5; i++){
//                System.out.println((i+1)+". Digite un numero: ");
//                arreglo[i] = entrada.nextInt();
//            }
//
//            //comprobar si el arreglo esta ordenado en forma creciente
//            for (int i=0; i<4; i++){
//                if (arreglo[i] < arreglo[i+1]){
//                    creciente = true;
//                }
//                if (arreglo[i]> arreglo[i+1]){ //Decreciente
//                    creciente = false;
//                    break;
//                }
//            }
//            if(creciente == false){
//                System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a ingresar los datos: ");
//            }
//        }while(creciente == false);
//
//        System.out.println("Digite un numero nuevo:");
//        numero = entrada.nextInt();
//        //Esto es para conocer en que posicion va el numero
//        while (arreglo[j]<numero && j<5){
//            sitio_numero++;
//            j++;
//        }
//        //por ultimo, trasladamos una posicion en el arrego a los elementos que van detras del numero
//        for (int i=4; i>=sitio_numero; i--){
//            arreglo[i+1] = arreglo[i];
//        }
//        //insertamos el numero que el usuario puso
//        arreglo[sitio_numero] = numero;
//
//        System.out.println("El arreglo queda: ");
//        for (int i =0; i<arreglo.length; i++){
//            System.out.print(arreglo[i]+" ");
//        }

        /*Leer dos series de 10 enteros, que estaran ordenados crecientemente. Copiar(fusionar) las
        * dos tablas en una tercera, de forma que sigan ordenados*/

//        Scanner entrada = new Scanner(System.in);
//        int[] a, b, c;
//        boolean creciente = true;
//
//        a = new int[10];
//        b = new int[10];
//        c = new int[20];
//
//        System.out.println("Digite el primer arreglo: ");
//        do{
//            //pedimos el arreglo
//            for(int i=0; i<10; i++){
//                System.out.println((i+1)+". Digite un numero: ");
//                a[i] = entrada.nextInt();
//            }
//                        //comprobar si el arreglo esta ordenado en forma creciente
//            for (int i=0; i<4; i++){
//                if (a[i] < a[i+1]){
//                    creciente = true;
//                }
//                if (a[i]> a[i+1]){ //Decreciente
//                    creciente = false;
//                    break;
//                }
//            }
//            if(creciente == false){
//                System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a ingresar los datos: ");
//            }
//        }while (creciente== false);
//
//        System.out.println("::::::::::::::::::::::::::::::::::::::::");
//        System.out.println("Digite el Segundo arreglo: ");
//        do{
//            //pedimos el arreglo
//            for(int i=0; i<10; i++){
//                System.out.println((i+1)+". Digite un numero: ");
//                b[i] = entrada.nextInt();
//            }
//            //comprobar si el arreglo esta ordenado en forma creciente
//            for (int i=0; i<4; i++){
//                if (b[i] < b[i+1]){
//                    creciente = true;
//                }
//                if (b[i]> b[i+1]){ //Decreciente
//                    creciente = false;
//                    break;
//                }
//            }
//            if(creciente == false){
//                System.out.println("El arreglo no esta ordenado en forma creciente, vuelva a ingresar los datos: ");
//            }
//        }while (creciente== false);
//
//        int i=0; //iterador para el arreglo a
//        int j=0; //iterador para el arreglo b
//        int k=0; //iterador para el arreglo c
//        while(i<10 && j<10){
//            if (a[i] < b[j]){ //si el elemento de a es menor de b
//                c[k] = a[i];
//                i++;
//            }else{
//                c[k] = b[j];
//                j++;
//            }
//            k++;
//        }
//
//        //cuando salimos del while, es por que un arreglo se ha copiado completamente
//        if (i == 10) {  //Significa que ya copiamos todo el arreglo a, y que falta en b
//            while (j<10){
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }else{
//            while (i<10){
//                c[k] = a[i];
//                i++;
//                k++;
//            }
//        }
//        System.out.println("MOSTRAR ARREGLO FINAL:::::::::::::");
//        for (k=0; k<c.length; k++){
//            System.out.print(c[k]+" ");
//        }


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
