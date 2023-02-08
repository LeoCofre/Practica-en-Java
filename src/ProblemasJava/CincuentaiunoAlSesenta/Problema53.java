package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema53 {

    public static void main(String[] args) {

        /*Dado un número, determine si es un número primo. Recuerde que un número primo es
        aquel que solo es divisible por 1 y por sí mismo.*/

        //Variables
        int n, i;
        boolean flag;
        String r = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero");
        n = teclado.nextInt();

        //Proceso
        flag = true;
        i = 2;

        while (i <= n / 2) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i++;
        }

        if (flag)
            r = " ES PRIMO";
        else
            r = " NO ES PRIMO";

        // Salida
        System.out.println("");
        System.out.println("Respuesta: " + r);
    }
}
