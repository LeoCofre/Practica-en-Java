package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema41 {

    public static void main(String[] args) {

        //Obtener la suma de los primeros N números naturales positivos.

        //Variables
        int i, n, s = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();

        //Proceso
        i = 1;
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        //Salida
        System.out.println("");
        System.out.println(" Suma : " + s);


    }
}