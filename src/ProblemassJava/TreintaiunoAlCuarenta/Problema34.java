package ProblemassJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema34 {

    public static void main(String[] args) {

             /*Determine el importe a pagar para el examen de admisión de una universidad, cuyo valor
             depende del nivel socioeconómico y el colegio de procedencia. */

        /*                       Nivel Social
            Colegio              A   B   C
            Nacional   (N)       300 200 100
            Particular (P)       400 300 200
         */

        //Variables
        char c, n;
        int mp = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Colegio: ");
        c = teclado.next().charAt(0);
        System.out.print("Nivel: ");
        n = teclado.next().charAt(0);

        //Proceso
        if (c == 'N') {
            if (n == 'A')
                mp = 300;
            else if (n == 'C')
                mp = 200;
            else if (n == 'c')
                mp = 100;
        } else if (c == 'P') {
            if (n == 'A')
                mp = 400;
            else if (n == 'B')
                mp = 300;
            else if (n == 'C')
                mp = 200;
        }

        //Salida
        System.out.println("");
        System.out.println("Monto a pagar: " + mp);

    }
}

