package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema86 {

    public static void main(String[] args) {

        // Dado un nombre, obtener la cantidad de caracteres que contiene.

        //Variables
        String nombre;
        int cantidad;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();

        //Proceso
        cantidad = nombre.length();

        //Salida
        System.out.println();
        System.out.println("La cantidad de letras que contiene el nombre es: " + cantidad);
    }
}
