package EjerciciosJava.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        //Dado un número, devolver el doble si el número no es par, caso contrario el triple.

        //Variables
        int numero, resultado;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Numero : ");
        numero = scanner.nextInt();

        //Proceso
        if (!(numero % 2 == 0)) {
            resultado = numero * 2;
        } else {
            resultado = numero * 3;
        }

        //Salida
        System.out.println("");
        System.out.println(" Resultado : " + resultado);

    }
}
