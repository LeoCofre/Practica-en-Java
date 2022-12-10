package EjerciciosJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        //Dada una letra, determinar si es una vocal.

        //Variables
        char letra;
        String respuesta = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        letra = teclado.next().charAt(0);

        //Proceso
        if (letra == 'a' || letra == 'A') {
            respuesta = "ES VOCAL";
        } else if (letra == 'e' || letra == 'E')
            respuesta = "ES VOCAL";
        else if (letra == 'i' || letra == 'I')
            respuesta = "ES VOCAL";
        else if (letra == 'o' || letra == 'O')
            respuesta = "ES VOCAL";
        else if (letra == 'u' || letra == 'U')
            respuesta = "ES VOCAL";
        else
            respuesta = "NO ES VOCAL";

        //Salida
        System.out.println("");
        System.out.println("La letra ingresada " + respuesta);

    }
}