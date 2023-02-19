package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema71 {

    public static void main(String[] args) {

        //Dado 5 números obtener la suma.

        //Variables
        int iterador, suma = 0;

        //Arreglos
        int[] numeros = new int[5];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        numeros[0] = teclado.nextInt();
        System.out.println("Ingrese segundo número: ");
        numeros[1] = teclado.nextInt();
        System.out.println("Ingrese tercer número: ");
        numeros[2] = teclado.nextInt();
        System.out.println("Ingrese cuarto número: ");
        numeros[3] = teclado.nextInt();
        System.out.println("Ingrese quinto número: ");
        numeros[4] = teclado.nextInt();

        //Proceso
        for (iterador = 0; iterador <= 4; iterador++)
            suma += numeros[iterador];

        //Salida
        System.out.println();
        System.out.println("La suma es: " + suma);
    }
}
