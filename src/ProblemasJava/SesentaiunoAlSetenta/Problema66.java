package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema66 {

    public static void main(String[] args) {

        //Hallar cuántos múltiplos de M hay en un rango de números enteros.

        //Variables
        int numeroInicial, numeroFinal, multiplo, cantidad = 0, iterador;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número inicial: ");
        numeroInicial = teclado.nextInt();
        System.out.println("Ingrese número final: ");
        numeroFinal = teclado.nextInt();
        System.out.println("Ingrese multiplo");
        multiplo = teclado.nextInt();

        //Proceso
        for (iterador = numeroInicial; iterador <= numeroFinal; iterador++) {
            if (iterador % multiplo == 0)
                cantidad += 1;
        }

        //Salida
        System.out.println();
        System.out.println("La cantidad de multiplos es: " + cantidad);

    }
}
