package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema47 {

    public static void main(String[] args) {

        //Dado un número, devolver el dígito mayor.

        //Variables
        int d, m = 0, n;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();

        //Proceso
        while (n > 0) {
            d = n % 10;
            if (d > m) {
                m = d;
            }
            n /= 10;
        }

        //Salida
        System.out.println("");
        System.out.println("Digito Mayor: " + m);
    }
}
