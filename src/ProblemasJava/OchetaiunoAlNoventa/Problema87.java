package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema87 {

    public static void main(String[] args) {

        /*Ingrese su nombre y apellido, y obtenga su nombre y apellido en mayúscula separado por
        una coma XXXXX, XXXXX. */

        //Variables
        String nombre, apellido, nombreApellidoMayuscula;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese apellido: ");
        apellido = teclado.nextLine();

        //Proceso
        nombreApellidoMayuscula = (nombre + "," + apellido).toUpperCase();

        //salida
        System.out.println("Nombre y apellido: " + nombreApellidoMayuscula);

    }
}
