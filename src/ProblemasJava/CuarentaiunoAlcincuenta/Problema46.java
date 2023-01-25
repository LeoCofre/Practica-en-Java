package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema46 {

    public static void main(String[] args) {

        //Dado un número, determinar la cantidad de dígitos pares que contiene.

        //Variables
        int d, c = 0, n;
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese Numero : ");
        n = teclado.nextInt();

        //Proceso
        while (n > 0) {
            d = n % 10;
            if (d % 2 == 0) {
                n /= 10;
            }
        }
        // Salida
        c += 1;
        System.out.println("");
        System.out.println("Cantidad de dígitos pares: " + c);
    }
}
