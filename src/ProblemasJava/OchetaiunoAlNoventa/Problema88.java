package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema88 {

    public static void main(String[] args) {

        //Dado un carácter, devolver su código ASCII.

        //Variables
        String caracter;
        int ascii;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese caracter: ");
        caracter = teclado.nextLine();

        //Proceso
        ascii = caracter.codePointAt(0);

        //Salida
        System.out.println();
        System.out.println("El código ASCII es: " + ascii);

    }
}
