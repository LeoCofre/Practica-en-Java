package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema75 {

    public static void main(String[] args) {

        /*Busque un número en 7 números ingresados y determine la posición y si existe o no el
        número buscado, use el método de búsqueda secuencial.*/

        //Variables
        int nb, p, i;
        String r;

        //Arreglos
        int[] n = new int[7];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        n[0] = teclado.nextInt();
        System.out.print("Numero 2: ");
        n[1] = teclado.nextInt();
        System.out.print("Numero 3: ");
        n[2] = teclado.nextInt();
        System.out.print("Numero 4: ");
        n[3] = teclado.nextInt();
        System.out.print("Numero 5: ");
        n[4] = teclado.nextInt();
        System.out.print("Numero 6: ");
        n[5] = teclado.nextInt();
        System.out.print("Numero 7: ");
        n[6] = teclado.nextInt();
        System.out.print("Numero a buscar: ");
        nb = teclado.nextInt();

        //Proceso
        r = " NO EXISTE";
        p = -1;
        for (i = 0; i <= n.length - 1; i++) {
            if (n[i] == nb) {
                r = " EXISTE";
                p = -1;
                break;
            }
        }


        //Salida
        System.out.println();
        System.out.println("Respuesta: " + r);
        System.out.println("Posición: " + p);
    }
}
