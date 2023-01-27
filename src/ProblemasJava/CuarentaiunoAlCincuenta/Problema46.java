package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema46 {

    public static void main(String[] args) {

        //Dado un número, determinar la cantidad de dígitos pares que contiene.

        //Variables
        int digito, numero, digitosPares = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese Numero : ");
        numero = teclado.nextInt();

        //Proceso
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                digitosPares += 1;
            }
            numero /= 10;
        }

        // Salida
        System.out.println("");
        System.out.println("Cantidad de dígitos pares: " + digitosPares);
    }
}
