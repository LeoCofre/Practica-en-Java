package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        //Determinar la suma de los N primeros números enteros positivos

        //Variables
        int n, s;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();

        //Proceso
        s = (n * (n + 1)) / 2;

        //Salida
        System.out.println("");
        System.out.println("Suma: " + s);

    }
}
