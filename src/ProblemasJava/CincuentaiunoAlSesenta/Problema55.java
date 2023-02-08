package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema55 {

    public static void main(String[] args) {

        //Dado un número entero en base 10, convertir el número a otra base menor que 10.

        //Variables
        int numero, base, digito, iterador = 0, convertido = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero Base 10 : ");
        numero = teclado.nextInt();
        System.out.print("Convertir a base:");
        base = teclado.nextInt();

        //Proceso
        while (numero > 0) {
            digito = numero % base;
            numero /= base;
            iterador = iterador * 10 + digito;
        }
        while (iterador > 0) {
            digito = iterador % 10;
            iterador /= 10;
            convertido = convertido * 10 + digito;
        }
        // Salida
        System.out.println();
        System.out.println("Resultado : " + convertido);
    }
}
