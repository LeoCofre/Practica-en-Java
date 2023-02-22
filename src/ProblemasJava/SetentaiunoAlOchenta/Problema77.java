package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema77 {

    public static void main(String[] args) {

        //Ordene 4 números usando el método de ordenación por intercambio (burbuja).

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
        LI = 0;
        LS = n.length - 1;

        for (i = LI; i <= LS - 1; i++) {
            for (j = LI; j <= LS - 1; j++) {


                if (n[j] > n[j + 1]) {
                    tmp = n[j];

                    n[j] = n[j + 1];
                    n[j + 1] = tmp;
                }
            }
        }

        //Salida
    }
}
