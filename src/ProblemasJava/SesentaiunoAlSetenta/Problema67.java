package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema67 {

    public static void main(String[] args) {

        /*Crear un algoritmo para hallar el factorial de un número. El factorial es el producto de todos
        los números consecutivos, desde la unidad hasta el número; por ejemplo, factorial de 3! (se denota !) es
        1 X 2 X 3 = 6. */

        //Variables
        int numero, factorial, iterador;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = teclado.nextInt();

        //Proceso
        factorial = 1;
        for (iterador = 1; iterador <= numero; iterador++)
            factorial *= iterador;

        //Salida
        System.out.println();
        System.out.println("El factorial es: " + factorial);
    }
}
