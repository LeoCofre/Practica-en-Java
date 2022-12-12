package ProblemassJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Problema24 {

    public static void main(String[] args) {

        //Variables
        double a, b, e, d, x1, x2;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("a : ");
        a = teclado.nextDouble();
        System.out.print("b : ");
        b = teclado.nextDouble();
        System.out.print("c : ");
        e = teclado.nextDouble();

        //Proceso
        d = Math.pow(b, 2.0) - 4.0 * a * e;

        if (a != 0 && d >= 0) {
            x1 = (-b + Math.pow(d, (1.0 / 2.0))) / 2 * a;
            x2 = (-b - Math.pow(d, (1.0 / 2.0))) / 2 * a;
        } else {
            x1 = 0;
            x2 = 0;
        }

        //Salida
        System.out.println("");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}