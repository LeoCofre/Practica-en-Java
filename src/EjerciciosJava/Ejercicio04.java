package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        //Hallar la potencia de a", donde <<a>> y <<n» pertenecen a z• (números enteros positivos).

        //Variables
        short a, n;
        int p;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("a : ");
        a = teclado.nextShort();
        System.out.print("n : ");
        n = teclado.nextShort();

        //Proceso
        p = (int) Math.pow((double) a, (double) n);

        //Salida
        System.out.println("");
        System.out.println(" Potencia : " + p);

    }
}
