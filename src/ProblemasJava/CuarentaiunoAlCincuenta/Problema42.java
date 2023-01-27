package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema42 {

    public static void main(String[] args) {

        //Dado un rango de números enteros, obtener la cantidad de números enteros que contiene.

        //Variables
        int iterador, numeroInicial, numeroFinal, cantidad = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número inicial");
        numeroInicial = scanner.nextInt();
        System.out.println("Ingrese número final");
        numeroFinal = scanner.nextInt();

        //Proceso
        iterador = numeroInicial + 1;
        while (iterador < numeroFinal) {
            cantidad += 1;
            iterador++;
        }

        //Salida
        System.out.println();
        System.out.println("Catidad de números: " + cantidad);
    }
}
