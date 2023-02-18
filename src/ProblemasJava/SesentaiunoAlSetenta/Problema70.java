package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema70 {

    public static void main(String[] args) {

        /*Dado un número y un divisor, determine cuál es el número múltiplo antecesor al número
        ingresado; por ejemplo, si ingresa N = 21 y D = 3, entonces R = 18 porque es el número múltiplo de 3
        antecesor de 21. */

        //Variables
        int n, d, i, r = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();
        System.out.print("Divisor : ");
        d = teclado.nextInt();

        //Proceso
        for (i = n - 1; i >= 1; i -= 1) {
            if (i % d == 0) {
                r = i;
                break;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Respuesta: " + r);
    }
}
