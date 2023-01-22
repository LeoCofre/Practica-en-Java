package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema43 {

    public static void main(String[] args) {

        // Dado un rango de números enteros, obtener la cantidad de números pares que contiene.

        //Variables
        int iterador, numeroInicial, numeroFinal, cantidadPares = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero inicial: ");
        numeroInicial = teclado.nextInt();
        System.out.print("Numero final: ");
        numeroFinal = teclado.nextInt();

        //Proceso
        iterador = numeroInicial + 1;
        while (iterador < numeroFinal) {
            if (iterador % 2 == 0) {
                cantidadPares += 1;
            }
            iterador++;
        }
        //Salida
        System.out.println("");
        System.out.println("Cantidad de pares: " + cantidadPares);
    }
}
