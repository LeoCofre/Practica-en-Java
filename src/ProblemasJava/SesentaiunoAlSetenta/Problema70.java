package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema70 {

    public static void main(String[] args) {

        /*Dado un número y un divisor, determine cuál es el número múltiplo antecesor al número
        ingresado; por ejemplo, si ingresa N = 21 y D = 3, entonces R = 18 porque es el número múltiplo de 3
        antecesor de 21. */

        //Variables
        int numero, divisor, iterador, respuesta = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        numero = teclado.nextInt();
        System.out.print("Divisor : ");
        divisor = teclado.nextInt();

        //Proceso
        for (iterador = numero - 1; iterador >= 1; iterador -= 1) {
            if (iterador % divisor == 0) {
                respuesta = iterador;
                break;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Respuesta: " + respuesta);
    }
}
