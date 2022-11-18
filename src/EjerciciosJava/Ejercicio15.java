package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        //Determinar si un número entero es par o impar.

        //Variables
        int numero;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        numero = scanner.nextInt();

        //Proceso
        if (numero % 2 == 0) {
            respuesta = " es par";
        } else {
            respuesta = " es impar";
        }

        //Salida
        System.out.println("");
        System.out.println("El numero ingresado "  + respuesta);

    }
}
