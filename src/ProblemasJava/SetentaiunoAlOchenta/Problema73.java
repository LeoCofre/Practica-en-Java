package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema73 {

    public static void main(String[] args) {

        /*Dado 5 números y un divisor, determinar cuantos números múltiplos hay del divisor en los 5
        números ingresados.*/

        //Variables
        int divisor, iterador, cantidad = 0;

        //Arreglos
        int[] numeros = new int[5];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer número:");
        numeros[0] = teclado.nextInt();
        System.out.println("Ingrese segundo número:");
        numeros[1] = teclado.nextInt();
        System.out.println("Ingrese tercer número:");
        numeros[2] = teclado.nextInt();
        System.out.println("Ingrese cuarto número:");
        numeros[3] = teclado.nextInt();
        System.out.println("Ingrese quinto número:");
        numeros[4] = teclado.nextInt();
        System.out.println("Ingrese divisor:");
        divisor = teclado.nextInt();

        //Proceso
        for (iterador = 0; iterador <= numeros.length - 1; iterador++) {
            if (numeros[iterador] % divisor == 0)
                cantidad += 1;
        }
    }

}
