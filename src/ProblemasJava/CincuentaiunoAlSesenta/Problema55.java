package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema55 {

    public static void main(String[] args) {

        //Dado un número entero en base 10, convertir el número a otra base menor que 10.

        //Variables
        int n, b, d, i = 0, r = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Nume r o Base 10 : ");
        n = teclado.nextInt();
        System.out.print("Convertir a base:");
        b = teclado.nextInt();

        //Proceso
        while (n > 0) {
            d = n % b;
            n /= b;
            i = i * 10 + d;
        }
        while (i > 0) {
            d = i % 10;
            i /= 10;
            r = r * 10 + d;
        }
        // Salida
        System.out.println();
        System.out.println("Resultado : " + r);
    }
}
