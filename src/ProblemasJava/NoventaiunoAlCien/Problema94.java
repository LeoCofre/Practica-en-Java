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
        String frase, fraseSinEspacios = "", acumuladorTemporal;
        int iterador, posicion;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        posicion = 0;
        frase = frase.trim();
        for (iterador = 0; iterador < frase.length(); iterador++) {
            if (frase.substring(iterador, iterador + 1).equals(" ")) {
                acumuladorTemporal = frase.substring(posicion, iterador);
                posicion = iterador + 1;
                fraseSinEspacios = fraseSinEspacios + acumuladorTemporal;

            }
        }
        acumuladorTemporal = frase.substring(posicion, iterador);
        fraseSinEspacios = fraseSinEspacios + acumuladorTemporal;

        // Salida
        System.out.println("");
        System.out.println(" Frase sin espacios: " + fraseSinEspacios);
    }
}