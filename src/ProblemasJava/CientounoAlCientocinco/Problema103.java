package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema103 {

    /*Ingrese 6 números en una matriz de 3x2 y obtenga el numero mayor ingresado. Cree una
    función para resolver el problema.

        Mayor{ E :num [] :Entero):Entero
    */

    public static void main(String[] args) {

        //Variables
        int m;

        //Arreglos
        int[][] n = new int[3][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero (0 , 0 ) : ");
        n[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1 ) : ");
        n[0][1] = teclado.nextInt();
        System.out.print(" Numero (1 , 0) : ");
        n[1][0] = teclado.nextInt();
        System.out.print(" Numero (1 , 1) : ");
        n[1][1] = teclado.nextInt();
        System.out.print(" Numero (2 , 0) : ");
        n[2][0] = teclado.nextInt();
        System.out.print(" Numero (2 , 1 ) : ");
        n[2][1] = teclado.nextInt();

        //Proceso
        m = Mayor(n);

        //Salida
        System.out.println("");
        System.out.println("Mayor : " + m);
    }

    //Método Mayor
    private static int Mayor(int num[][]) {

        //Variables
        int m, i, j;

        //Proceso
        m = num[0][0];
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 1; j++) {
                if (num[i][j] > m)
                    m = num[i][j];
            }
        }
        //Salida
        return m;
    }
}


