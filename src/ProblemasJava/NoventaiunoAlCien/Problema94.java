package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema94 {


    //Dado una frase devolver la frase sin espacio en blancos.
/*
        //Variables
        String frase;
        StringBuilder fraseSinEspacios = new StringBuilder();
        String temporal;
        int iterador, posicion;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        posicion = 0;
        frase = frase.trim();
        for (iterador = 0; iterador < frase.length(); iterador++)
            if (frase.charAt(iterador) == ' ') {
                temporal = frase.substring(posicion, iterador);
                posicion = iterador + 1;
                fraseSinEspacios.append(temporal);
                temporal = frase.substring(posicion, iterador);
                fraseSinEspacios.append(temporal);
            }
        //Salida
        System.out.println();
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }*/

    public static void main(String[] args) {

        //Variables
        String fl, f2 = "", t;
        int i, p;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        fl = teclado.nextLine();

        //Proceso
        p = 0;
        fl = fl.trim();
        for (i = 0; i < fl.length(); i++) {


            if (fl.substring(i, i + 1).equals(" ")) {
                t = fl.substring(p, i);
                p = i + 1;
                f2 = f2 + t;
                t = fl.substring(p, i);
                f2 = f2 + t;
            }
        }
        // Salida
        System.out.println("");
        System.out.println(" Frase sin espacios: " + f2);
    }
}