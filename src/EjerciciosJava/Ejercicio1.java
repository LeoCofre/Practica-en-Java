package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Problema N°1, Suma de dos numeros

        //Variables
        int n1, n2, s;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1: ");
        n1 = teclado.nextInt();
        System.out.println("Numero 2");
        n2 = teclado.nextInt();

        //Proceso
        s = n1 + n2;

        //Salida

        System.out.println("");
        System.out.println("Suma:" + s);

    }
}
