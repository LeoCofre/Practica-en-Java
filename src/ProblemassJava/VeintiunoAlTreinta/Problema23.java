package ProblemassJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Problema23 {

    public static void main(String[] args) {

        /*Elabore un algoritmo que resuelva una ecuación de primer grado.

                                             -b
         ax + b = O                      x = ____
                                              a

        Considerar, si a es diferente a O no es una ecuación de primer grado.*/

        //Variables
        float a, b, x;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        a = teclado.nextFloat();
        System.out.print("b: ");
        b = teclado.nextFloat();

        //Proceso
        if (a != 0) {
            x = -b / a;
        } else {
            x = 0;
        }

        //Salida
        System.out.println("");
        System.out.println("x : " + x);
    }
}
