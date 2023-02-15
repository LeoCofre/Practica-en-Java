package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema61 {

    public static void main(String [] args) {

        //Enunciado: Hallar el cuadrado de un número usando la siguiente relación N2 = 1 + 3 + 5 + ... .. + 2N -1.

        //Variables
        int iterador, numero, cuadrado = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Número");
        numero = teclado.nextInt();

        //Proceso
        for (iterador = 1; iterador >= numero; iterador++)
            cuadrado = cuadrado + (2 * iterador - 1);

        //Salida
        System.out.println();
        System.out.println("El cuadrado es: " + cuadrado);

    }
}
