package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema89 {

    public static void main(String[] args) {

        //Al ingresar una letra determine si es una vocal.

        //Variables
        String letra, respuesta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        letra = teclado.nextLine();

        //Proceso
        letra = letra.toUpperCase();
        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                respuesta = "ES VOCAL";
                break;
            default:
                respuesta = "NO ES VOCAL";
                break;
        }

        //Salida
        System.out.println();
        System.out.println("La letra ingresada: " + respuesta);

    }
}
