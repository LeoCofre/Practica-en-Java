package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema90 {

    public static void main(String[] args) {

        //Dado un carácter, determine si es una letra, número o símbolo.

        //Variables
        String caracter, respuesta;
        int ascii;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Caracter : ");
        caracter = teclado.nextLine();

        //Proceso
        ascii = caracter.toUpperCase().codePointAt(0);
        if (ascii >= 48 && ascii <= 57)
            respuesta = " ES NUMERO";
        else if (ascii >= 65 && ascii <= 90)
            respuesta = "ES LETRA";
        else
            respuesta = "ES SIMBOLO";

        //Salida
        System.out.println();
        System.out.println("El caracter ingresado: " + respuesta);
    }
}
