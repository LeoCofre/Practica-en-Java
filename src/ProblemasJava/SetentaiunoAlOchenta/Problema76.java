package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema76 {

    public static void main(String[] args) {

        /*Lea 4 números y almacénelos en un vector de llamado A, y otros 4 números en un vector
        llamado B, y determine cuántos números de A se encuentran en B.*/

        //Variables
        int c = 0, i, j;

        //Arreglos
        int[] a = new int[4];
        int[] b = new int[4];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Arreglo A: ");
        System.out.println("==========");
        System.out.print("Numero 1: ");
        a[0] = teclado.nextInt();
        System.out.print("Numero 2: ");
        a[1] = teclado.nextInt();
        System.out.print("Numero 3: ");
        a[2] = teclado.nextInt();
        System.out.print("Numero 4: ");
        a[3] = teclado.nextInt();

        System.out.println();
        System.out.println("Arreglo B: ");
        System.out.println("==========");
        System.out.print("Numero 1: ");
        b[0] = teclado.nextInt();
        System.out.print("Numero 2: ");
        b[1] = teclado.nextInt();
        System.out.print("Numero 3: ");
        b[2] = teclado.nextInt();
        System.out.print("Numero 4: ");
        b[3] = teclado.nextInt();

        //Proceso
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= b.length - 1; j++) {
                if (a[i] == b[j])
                    c += 1;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad : " + c);
    }
}