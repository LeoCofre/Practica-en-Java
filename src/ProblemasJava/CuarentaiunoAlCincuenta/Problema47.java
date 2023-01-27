package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema47 {

    public static void main(String[] args) {

        //Dado un número, devolver el dígito mayor.

        //Variables
        int digito, numero, mayor = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        numero = teclado.nextInt();

        //Proceso
        while (numero > 0) {
            digito = numero % 10;
            if (digito > mayor) {
                mayor = digito;
            }
            numero /= 10;
        }

        //Salida
        System.out.println("");
        System.out.println("Digito Mayor: " + mayor);
    }
}
