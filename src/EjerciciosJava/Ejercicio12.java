package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        //Determinar si un número entero es positivo, negativo o neutro.

        //Variables
        int numero;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Re sultad o : " + respuesta);


    }
}
