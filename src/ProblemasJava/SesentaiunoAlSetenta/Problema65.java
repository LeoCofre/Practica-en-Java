package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema65 {

    public static void main(String[] args) {

        /*Dado un rango numérico entero (número inicial y número final), obtener la cantidad de
        números positivos y negativos que existen en el rango.*/

        //variables
        int numeroInicial, numeroFinal, cantidadPositivos = 0, cantidadNegativos = 0, iterador;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número inicial: ");
        numeroInicial = teclado.nextInt();
        System.out.println("Ingrese número final: ");
        numeroFinal = teclado.nextInt();

        //Proceso
        for (iterador = numeroInicial; iterador <= numeroFinal; iterador++) {
            if (iterador != 0) {
                if (iterador < 0)
                    cantidadNegativos += 1;
                else
                    cantidadPositivos += 1;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        System.out.println("Cantidad de números negativos: " + cantidadNegativos);

    }
}
