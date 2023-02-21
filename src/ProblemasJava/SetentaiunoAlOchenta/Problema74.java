package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema74 {

    public static void main(String[] args) {

        //Dado 5 números, obtener la cantidad de números primos ingresados.

        //Variables
        int cantidadPrimos = 0, i, j;
        boolean flag;

        //Arreglos
        int[] numeros = new int[5];

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        numeros[0] = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        numeros[1] = scanner.nextInt();
        System.out.println("Ingrese tercer número");
        numeros[2] = scanner.nextInt();
        System.out.println("Ingrese cuarto número");
        numeros[3] = scanner.nextInt();
        System.out.println("Ingrese quinto número");
        numeros[4] = scanner.nextInt();


    }
}
