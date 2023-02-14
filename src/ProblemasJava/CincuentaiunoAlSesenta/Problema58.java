package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema58 {

    public static void main(String[] args) {

        //Dado un rango de números enteros, obtener la cantidad de números pares que contiene.

        //Variables
        int iterador, numeroInicial, numeroFinal, cantidadPares = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número Inicial: ");
        numeroInicial = teclado.nextInt();
        System.out.print("Número Final: ");
        numeroFinal = teclado.nextInt();

        //Proceso
        numeroInicial = numeroInicial + 1;
        numeroFinal = numeroFinal - 1;
        for (iterador = numeroInicial; iterador <= numeroFinal; iterador++) {
            if (iterador % 2 == 0)
                cantidadPares += 1;
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de números pares : " + cantidadPares);
    }
}
