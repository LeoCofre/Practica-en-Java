package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema58 {

    public static void main(String[] args) {

        //Dado un rango de números enteros, obtener la cantidad de números pares que contiene.

        //Variables
        int i, ni, nf, cp = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número Inicial: ");
        ni = teclado.nextInt();
        System.out.print("Número Final: ");
        nf = teclado.nextInt();

        //Proceso
        ni = ni + 1;
        nf = nf - 1;
        for (i = ni; i <= nf; i++) {
            if (i % 2 == 0)
                cp += 1;
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de números pares : " + cp);
    }
}
