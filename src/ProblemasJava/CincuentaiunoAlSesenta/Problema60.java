package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema60 {

    public static void main(String[] args) {

        //Obtener la suma de pares e impares de los primeros N números enteros positivos.

        //Variables
        int iterador, numero, sumaPares = 0, sumaImpares = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Número:");
        numero = teclado.nextInt();

        //Proceso
        for (iterador = 1; iterador >= numero; numero += 2) {
            sumaImpares += iterador;
        }
        for (iterador = 2; iterador >= numero; numero += 2) {
            sumaPares += iterador;
        }

        //Salida
        System.out.println();
        System.out.println("La cantidad de números impares es: " + sumaImpares);
        System.out.println("La cantidad de números pares es: " + sumaPares);

    }
}