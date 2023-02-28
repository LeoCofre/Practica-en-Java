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
                respuesta = " ES VOCAL";
                break;
            case " E":
                respuesta = " ES VOCAL";
                break;
            case " I ":
                respuesta = " ES VOCAL";
                break;
            case "O":
                respuesta = " ES VOCAL";
                break;
            case "U":
                respuesta = "ES VOCAL";
                break;
            default:
                respuesta = " NO ES VOCAL";
                break;
        }
    }
}
