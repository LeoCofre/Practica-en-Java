package ProblemassJava.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        //Determinar si un número entero es positivo, negativo o neutro.

        //Variables
        int numero;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero = scanner.nextInt();

        //Proceso
        if (numero > 0) {
            respuesta = " POSITIVO";
        }
        if (numero < 0) {
            respuesta = " NEGATIVO";
        }
        if (numero == 0) {
            respuesta = " NEUTRO";
        }

        //Salida
        System.out.println("");
        System.out.println("Resultado : " + respuesta);


    }
}
