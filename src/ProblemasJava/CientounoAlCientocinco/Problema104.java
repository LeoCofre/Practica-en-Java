package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema104 {

    /*Dado la matriz A de 2x2, la matriz B de 2x2, obtenga la suma de dichas matriz. Cree una
    función para resolver el problema.

            Mayor{ E :num [] :Entero):Entero
    */

    public static void main(String[] args) {

        //Arreglos
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] e = new int[2][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Arreglo A: ");
        System.out.println(" =========== : ");
        System.out.print(" Numero (0 , 0) : ");
        a[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1) : ");
        a[0][1] = teclado.nextInt();
        System.out.print(" Numero ( 1 , 0) : ");
        a[1][0] = teclado.nextInt();
        System.out.print(" Numero ( 1 , 1) : ");
        a[1][1] = teclado.nextInt();
        System.out.println();
        System.out.println("Arreglo B: ");
        System.out.println(" =========== : ");
        System.out.print(" Numero (0 , 0) : ");
        b[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1 ): ");
        b[0][1] = teclado.nextInt();
        System.out.print(" Numero (1 , 0) : ");
        b[1][0] = teclado.nextInt();
        System.out.print(" Numero (1 , 1 ) : ");
        b[1][1] = teclado.nextInt();

    }
}