package com.exercises.javacurso.optional.repositorio;

import com.exercises.javacurso.optional.models.ObjetoDos;
import com.exercises.javacurso.optional.models.ObjetoTres;
import com.exercises.javacurso.optional.models.ObjetoUno;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class EjercicioOp {
    public static void main(String[] args) {
        AtomicReference<String> valor = new AtomicReference<>();
        String codd = "";
        ObjetoTres objetoTres = new ObjetoTres();
        objetoTres.setCodigo("222520");
        ObjetoDos objetoDos = new ObjetoDos();
        objetoDos.setObjetoTres(objetoTres);
        ObjetoUno objetoUno =new ObjetoUno();
        objetoUno.setObjetoDos(objetoDos);

        ObjetoTres obj3 = new ObjetoTres();
        obj3.setCodigo("899999");

        System.out.println("::::::");


        Boolean bol = Optional.ofNullable(objetoUno).flatMap(uno -> Optional.ofNullable(uno.getObjetoDos())).flatMap(dos -> Optional.ofNullable(dos.getObjetoTres())).flatMap(tres -> Optional.ofNullable(tres.getCodigo())).isPresent();

        if (bol){
            System.out.println("44444dddddd");
        }

        System.out.println(":::::::::::::::::::::::::::::::::::");
//        String val = "190,S103FAAS135506043600";
//        char[]  chartArray = val.toCharArray();
//        int index = 0;
//        int position = 0;
//        for (char r: chartArray) {
//            System.out.print(r+" - ");
//            if (((r >= 'a' && r <= 'z') || (r >= 'A' && r <= 'Z')) && position <1){
//                position = index;
//            }
//            index++;
//        }
//        System.out.println("Position: "+position);

        String sD = "11250,";

        String[] sNum = sD.split(",");
        System.out.println("LENGTH::"+sNum.length);
        System.out.println("sNum 0::"+sNum[0]);
//        String n = sNum[1];
        if(sNum.length <= 1){
            sD = sD.concat("00");
            System.out.println("pppppppppp");
        }
        if (sNum.length>=2 && sNum[1].length()<=1){
            sD = sD.concat("0");
        }

//        System.out.println("decimal"+n);
    }
}
