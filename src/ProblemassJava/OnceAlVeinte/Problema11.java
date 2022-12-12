package ProblemassJava.OnceAlVeinte;

import java.util.Scanner;

public class Problema11 {

    public static void main(String[] args) {

        //Dado dos números enteros diferentes, devolver el número mayor.

        //Variables
        int primerNumero, segundoNumero, mayor = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo número: ");
        segundoNumero = scanner.nextInt();

        //Proceso
        if (primerNumero > segundoNumero) {
            mayor = primerNumero;
        }
        if (segundoNumero > primerNumero) {
            mayor = segundoNumero;
        }

        //Salida
        System.out.println("");
        System.out.println("El numero mayor es: " + mayor);

    }
}
