package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema53 {

    public static void main(String[] args) {

        /*Dado un número, determine si es un número primo. Recuerde que un número primo es
        aquel que solo es divisible por 1 y por sí mismo.*/

        //Variables
        int numero, iterador;
        boolean esPrimo;
        String respuesta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero");
        numero = teclado.nextInt();

        //Proceso
        esPrimo = true;
        iterador = 2;

        while (iterador <= numero / 2) {
            if (numero % iterador == 0) {
                esPrimo = false;
                break;
            }
            iterador++;
        }

        if (esPrimo)
            respuesta = " ES PRIMO";
        else
            respuesta = " NO ES PRIMO";

        // Salida
        System.out.println();
        System.out.println("Respuesta: " + respuesta);
    }
}
