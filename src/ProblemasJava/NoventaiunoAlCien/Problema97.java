package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema97 {

        public static void main(String[] args) {

            /*Dado dos números enteros diferentes, devolver el número mayor. Cree una función para
            resolver el problema.
            */

         //Variables
        int n1, n2, m = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nume ro 1 : ");
        n1 = teclado.nextInt();
        System.out.print(" Numero 2 : ");
        n2 = teclado.nextInt();

        //Proceso
        m = mayor(n1, n2);

        //Salida
        System.out.println("");
        System.out.println("Mayor : " + m);
    }

    //Método Mayor
    private static int mayor(int n1, int n2) {

        //Variables

        int m = 0;
        //Proceso
        if (n1 > n2)
            m = n1;
        if (n2 > n1)
            m = n2;
        //Salida
        return m;
    }
}