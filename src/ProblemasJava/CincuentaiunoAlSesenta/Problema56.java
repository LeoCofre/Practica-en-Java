package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema56 {

    public static void main(String[] args) {

        //Obtener la suma de los primeros N números naturales positivos.

        //Variables
        int i, n, s = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();

        //Proceso
        for (i = 1; i <= n; i++)
            s = s + i;

        //Salida
        System.out.println();
        System.out.println("Suma: " + s);

    }
}
