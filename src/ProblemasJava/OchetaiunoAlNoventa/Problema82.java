package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema82 {

    public static void main(String[] args) {

        //Dado la matriz A de 2x2, la matriz B de 2x2, obtenga la suma de dichas matriz.

        //Variables
        int i, j;

        //Arreglos
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Arreglo A: ");
        System.out.println(" =========== : ");
        System.out.print(" Numero (0 , 0 ) : ");
        a[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1) : ");
        a[0][1] = teclado.nextInt();
        System.out.print(" Numero (1 , 0 ) : ");
        a[1][0] = teclado.nextInt();
        System.out.print(" Numero ( 1 , 1 ) : ");
        a[1][1] = teclado.nextInt();

        System.out.println();
        System.out.println("Arreglo B: ");
        System.out.println(" =========== : ");
        System.out.print(" Numero (0 , 0 ) : ");
        b[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1) : ");
        b[0][1] = teclado.nextInt();
        System.out.print(" Numero ( 1 , 0 ) : ");
        b[1][0] = teclado.nextInt();
        System.out.print(" Numero ( 1 , 1) : ");
        b[1][1] = teclado.nextInt();

        //Proceso
        for (i = 0; i <= 1; i++) {
            for (j = 0; j <= 1; j++)
                c[i][j] = a[i][j] + b[i][j];
        }

        //Salida
        System.out.println();
        System.out.println("Arreglo C : ");
        System.out.println(" =========== : ");
        System.out.println("Numero (0,0) " + c[0][0]);
        System.out.println("Numero (0,1) " + c[0][1]);
        System.out.println("Numero (1,0) " + c[1][0]);
        System.out.println("Numero (1,1) " + c[1][1]);
    }
}
