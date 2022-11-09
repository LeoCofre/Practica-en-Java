package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        //Suma de dos numeros

        //Variables
        int numero1, numero2, resultado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Numero 2");
        numero2 = teclado.nextInt();

        //Proceso
        resultado = numero1 + numero2;

        //Salida

        System.out.println("");
        System.out.println("Suma:" + resultado);

    }
}


//Variables
//Entrada
//Proceso
//Salida