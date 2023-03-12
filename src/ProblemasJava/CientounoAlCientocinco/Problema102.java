package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema102 {

    /*Ordene 4 números usando el método de ordenación por intercambio (burbuja). Cree un
    procedimiento para resolver el problema.

          Ordenar (S:num(]:Entero)
    */

    public static void main(String[] args) {

        //Variables
        int tmp, i, j, LI, LS;

        //Arreglos
        int[] n = new int[4];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero 1 : ");
        n[0] = teclado.nextInt();
        System.out.print(" Numero 2 : ");
        n[1] = teclado.nextInt();
        System.out.print(" Numero 3 : ");
        n[2] = teclado.nextInt();
        System.out.print(" Numero 4 : ");
        n[3] = teclado.nextInt();

        //Proceso
        ordenar(n);

        //Salida
        System.out.println("");
        System.out.println("Ordenado");
        System.out.println(" Numero 1 : " + n[0]);
        System.out.println(" Numero 2 : " + n[1]);
        System.out.println(" Numero 3 : " + n[2]);
        System.out.println(" Numero 4 : " + n[3]);
    }

    private static void ordenar(int[] num) {

        //Variables
        int tmp, i, j, LI, LS;

        //Arreglos
        int[] n = num;

        //Proceso
        LI = 0;
        LS = n.length - 1;

        for (i = LI; i <= LS - 1; i++) {
            for (j = LI; j <= LS - 1; j++) {

                if (n[j] > n[j + 1]) {
                    tmp = n[j];
                }
            }
        }
        //Salida
        num = n;
    }

}