package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema90 {

    public static void main(String[] args) {

        //Dado un carácter, determine si es una letra, número o símbolo.

        //Variables
        String c, r;
        int a;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Caracter : ");
        c = teclado.nextLine();

        //Proceso
        a = c.toUpperCase().codePointAt(0);
        if (a >= 48 && a <= 57)
            r = " ES NUMERO";
        else if (a >= 65 && a <= 90)
            r = "ES LETRA";
        else
            r = "ES SIMBOLO";

        //Salida
        System.out.println();
        System.out.println("El caracter ingresado: " + r);
    }
}
