package ProblemasJava.OnceAlVeinte;

import java.util.Scanner;

public class Problema13 {

    public static void main(String[] args) {

        //Dado un carácter determinar si es una vocal.

        //Variables
        char caracter;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        caracter = scanner.next().charAt(0);

        //Proceso
        respuesta = " NO ES VOCAL";
        if (caracter == 'a' || caracter == 'A') {
            respuesta = " ES VOCAL";
        }
        if (caracter == 'e' || caracter == 'E') {
            respuesta = " ES VOCAL";
        }
        if (caracter == 'i' || caracter == 'I') {
            respuesta = " ES VOCAL";
        }

        if (caracter == 'o' || caracter == 'O') {
            respuesta = " ES VOCAL";
        }

        if (caracter == 'u' || caracter == 'U') {
            respuesta = " ES VOCAL";
        }
        //Salida
        System.out.println("");
        System.out.println(" Resultado : " + respuesta);

    }
}
