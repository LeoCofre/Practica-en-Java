package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema94 {

    public static void main(String[] args) {

        //Dado una frase devolver la frase sin espacio en blancos.


        //Variables
        String frase, fraseSinEspacios = "", temporal;
        int iterador, posicion;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        posicion = 0;
        frase = frase.trim();
        for (iterador = 0; iterador < frase.length(); iterador++) {


            if (frase.charAt(iterador) == ' ') {
                temporal = frase.substring(posicion, iterador);
                posicion = iterador + 1;
                fraseSinEspacios = fraseSinEspacios + temporal;
                temporal = frase.substring(posicion, iterador);
                fraseSinEspacios = fraseSinEspacios + temporal;
            }

            //Salida
            System.out.println();
            System.out.println("Frase sin espacios: " + fraseSinEspacios);
        }
    }
}