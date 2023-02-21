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
    }
}
