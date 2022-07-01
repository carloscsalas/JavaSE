package com.exercises.javase.busqueda;

import javax.swing.*;

public class secuencial {

    public static void main(String[] args) {
        int[] arreglo = {5,3,2,1,4};
        int dato;
        boolean flat = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar"));

        int i=0;

        while(i<5 && flat == false){
            if (arreglo[i] == dato){
                flat = true;
            }
            i++;
        }
        if (flat == false){
            JOptionPane.showMessageDialog(null,"No se encontro el numero indicado");
        }else{
            JOptionPane.showMessageDialog(null,"Si se encontro el numero indicado");
        }
    }
}
