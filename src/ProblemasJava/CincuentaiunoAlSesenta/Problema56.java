package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema56 {

    public static void main(String[] args) {

        //Obtener la suma de los primeros N números naturales positivos.

        //Variables
        int iterador, numero, suma = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        numero = teclado.nextInt();

        //Proceso
        for (iterador = 1; iterador <= numero; iterador++)
            suma = suma + iterador;

        //Salida
        System.out.println();
        System.out.println("La suma es: " + suma);

    }
}
