package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema69 {

    public static void main(String[] args) {

        //Determine cuántos números primos hay en los primeros N números enteros positivos.

        //Variables
        int numero, cantidad = 0, i, j;
        boolean flag;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = teclado.nextInt();

        //Proceso

        for (i = 2; i <= numero; i++) {
            flag = true;

            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cantidad += 1;
                flag = true;
            }
        }

        //Salida
        System.out.println();
        System.out.println("La cantiada es: " + cantidad);
    }
}