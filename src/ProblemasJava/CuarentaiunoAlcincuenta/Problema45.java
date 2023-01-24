package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema45 {

    public static void main(String[] args) {

        //Dado un número, determinar cuantos dígitos tiene.

        //Variables
        int i, n, c = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();

        //Proceso
        while (n > 0) {
            n = n / 10;
            c += 1;
        }

        // Salida
        System.out.println("");
        System.out.println("Cant . Digitos : " + c);
    }
}
