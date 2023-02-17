package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema64 {

    public static void main(String[] args) {

        /*Escriba un algoritmo que calcule la suma de la siguiente serie, hasta el número entero
        positivo N ingresado.

        1   2   3   4                                     1   2   7
        - + - + - + -  , por ejemplo SI es 3 entonces     - + - + - = 1,1666667
        2   3   4   N                                     2   3   6

        */

        //Variables
        float iterador, numero, suma = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = teclado.nextFloat();

        //Proceso
        for (iterador = 1; iterador <= numero - 1; iterador++)
            suma = suma + (iterador / (iterador + 1));

        //Salida
        System.out.println();
        System.out.println("La suma es: " + suma);

    }
}
