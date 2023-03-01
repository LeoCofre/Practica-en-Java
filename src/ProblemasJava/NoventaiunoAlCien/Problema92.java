package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema92 {

    public static void main(String[] args) {

       /* Según las siguientes especificaciones, genere un código basado en el nombre ingresado.

        Especificaciones para generar el código:

        Primer  carácter del código: Primer carácter del nombre.
        Segundo carácter del código: Tercer carácter del nombre.
        Tercer  carácter del código: Último carácter del nombre.
        Cuarto  carácter del código: Cantidad de caracteres del nombre.*/

        //Variables
        String primerCaracter, segundoCaracter, tercerCaracter, cuartoCaracter, nombre, codigo;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre : ");
        nombre = teclado.nextLine();

        //Proceso
        primerCaracter = nombre.substring(0, 1);
        segundoCaracter = nombre.substring(2, 3);
        tercerCaracter = nombre.substring(nombre.length() - 1);
        cuartoCaracter = String.valueOf(nombre.trim().length());
        codigo = (primerCaracter + segundoCaracter + tercerCaracter + cuartoCaracter).toUpperCase();

        //Salida
        System.out.println("");
        System.out.println("Codigo : " + codigo);
    }
}
