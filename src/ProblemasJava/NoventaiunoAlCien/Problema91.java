package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema91 {

    public static void main(String[] args) {

        //Se desea obtener los N primeros caracteres de un nombre.

        //Variables
        String nombre, respuesta;
        int cantidad;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese cantidad de primeros caracteres a mostrar: ");
        cantidad = teclado.nextInt();

        //Proceso
        respuesta = nombre.substring(0, cantidad);

        //Salida
        System.out.println();
        System.out.println("La respuesta es: " + respuesta);
    }
}
