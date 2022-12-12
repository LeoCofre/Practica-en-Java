package ProblemassJava.UnoAlDiez;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        // Hallar la radicación, donde <<a» y «n>> pertenecen a z• (números enteros positivos).

        //Variables
        int a;
        short n, r;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        a = teclado.nextInt();
        System.out.print("n: ");
        n = teclado.nextShort();

        //Proceso
        r = (short) Math.pow((double) a, (1 / (double) n));

        //Salida
        System.out.println("");
        System.out.println("Potencia: " + r);

    }
}
