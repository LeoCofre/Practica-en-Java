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
        if (letra == 'a' || letra == 'A')
            respuesta = "La letra ingresada es una vocal";
        else if (letra == 'e' || letra == 'E') {
            respuesta = "La letra ingresada es una vocal";
             if (letra == 'i' || letra == 'I') {
                respuesta = "La letra ingresada es una vocal";
            }

        }
    }
}