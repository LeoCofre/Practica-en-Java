package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema84 {

    public static void main(String[] args) {

        //Ingrese 6 números en una matriz de 3x2 y ordene los números de cada columna.

        //Variables
        int tmp, i, j, LS;

        //Arreglos
        int[][] n = new int[3][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero (0 , O) : ");
        n[0][0] = teclado.nextInt();
        System.out.print("Numero (0 , 1) : ");
        n[1][1] = teclado.nextInt();
        System.out.print("Numero (1, 0 ): ");
        n[1][0] = teclado.nextInt();
        System.out.print("Numero (1 , 1 ): ");
        n[1][1] = teclado.nextInt();
        System.out.print("Numero (2 , 0) : ");
        n[2][0] = teclado.nextInt();
        System.out.print("Numero (2 , 1 ): ");
        n[2][1] = teclado.nextInt();

        //Proceso
        LS = 2;
        for (i = 0; i <= LS - 1; i++) {
            for (j = 0; j <= LS - 1; j++) {
                if (n[j][0] > n[j + 1][0]) {
                    tmp = n[j][0];
                    n[j][0] = n[j + 1][0];
                    n[j + 1][0] = tmp;

                }
            }
        }
    }
}