package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema96 {

    public static void main(String[] args) {

        //Dados dos números enteros, hallar la suma. Cree una función para resolver el problema.

        //Variables
        int nl, n2, s;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero 1 : ");
        nl = teclado.nextInt();
        System.out.print("Numero 2 : ");
        n2 = teclado.nextInt();

        //Proceso
        s = sumar(nl, n2);

        //Salida
        System.out.println("");
        System.out.println(" Suma : " + s);
    }

    //Método Sumar
    private static int sumar(int Numl, int Num2) {
        int s;
        s = Numl + Num2;
        return s;
    }
}
