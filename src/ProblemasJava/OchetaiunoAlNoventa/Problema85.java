package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema85 {

    public static void main(String[] args) {

        //Almacene 9 números en una matriz de 3x3 y obtenga los números ordenados.

        //Variables
        int tmp, i, j, x, LS;

        //Arreglos
        int[][] n = new int[3][3];
        int[] o = new int[9];


        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero (0 , 0) :");
        n[0][0] = teclado.nextInt();
        System.out.println("Numero (0 , 1) :");
        n[0][1] = teclado.nextInt();
        System.out.println("Numero (0 , 2) :");
        n[0][2] = teclado.nextInt();
        System.out.println("Numero (1 , 0) :");
        n[1][0] = teclado.nextInt();
        System.out.println("Numero (1 , 1) :");
        n[1][1] = teclado.nextInt();
        System.out.println("Numero (1 , 2) :");
        n[1][2] = teclado.nextInt();
        System.out.println("Numero (2 , 0) :");
        n[2][0] = teclado.nextInt();
        System.out.println("Numero (2 , 1) :");
        n[2][1] = teclado.nextInt();
        System.out.println("Numero (2 , 2) :");
        n[2][2] = teclado.nextInt();

        //Proceso
        x = 0;
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                o[x] = n[i][j];
                x++;
            }
        }
        LS = o.length - 1;
        for (i = 0; i <= LS - 1; i++) {
            for (j = 0; j <= LS - 1; j++) {
                if (o[j] > o[j + 1]) {
                    tmp = o[j + 1];
                    o[j + 1] = o[j];
                    o[j] = tmp;
                }
            }
        }
        x = 0;
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                n[i][j] = o[x];
                x++;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Ordenado");
        System.out.println("Número ( 0 , 0 )" + n[0][0]);
        System.out.println("Número ( 0 , 1 )" + n[0][1]);
        System.out.println("Número ( 0 , 2 )" + n[0][2]);
        System.out.println("Número ( 1 , 0 )" + n[1][0]);
        System.out.println("Número ( 1 , 1 )" + n[1][1]);
        System.out.println("Número ( 1 , 2 )" + n[1][2]);
        System.out.println("Número ( 2 , 0 )" + n[2][0]);
        System.out.println("Número ( 2 , 1 )" + n[2][1]);
        System.out.println("Número ( 2 , 2 )" + n[2][2]);

    }
}