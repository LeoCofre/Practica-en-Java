package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema101 {

    /*Dado 5 números obtener la suma. Cree una función para resolver el problema.

    Sumar(E :num [):Entero ):Entero*/

    public static void main(String[] args) {

        //Variables
        int s = 0, i;

        //Arreglos
        int[] n = new int[5];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1 : ");
        n[0] = teclado.nextInt();
        System.out.print("Numero 2 : ");
        n[1] = teclado.nextInt();
        System.out.print("Numero 3 : ");
        n[2] = teclado.nextInt();
        System.out.print("Numero 4 : ");
        n[3] = teclado.nextInt();
        System.out.print("Numero 5 : ");
        n[4] = teclado.nextInt();

        //Proceso
        s = sumar(n);

        //Salida
        System.out.println("");
        System.out.println(" Suma : " + s);

    }

    //Método Sumar
    private static int sumar(int[] num) {

        //Variables
        int s = 0, i;

        //Proceso
        for (i = 0; i <= 4; i++)
            s += num[i];

        //Salida
        return s;
    }
}