package ProblemasJava.UnoAlDiez;

import java.util.Scanner;

public class Problema09 {

    public static void main(String[] args) {

        //Calcular area de un circulo

        //Constantes
        final float PI = 3.14159F;

        //Variables
        float a, r;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Radio: ");
        r = teclado.nextFloat();

        //Proceso
        a = (float) (PI * (Math.pow((double) r, 2.0)));

        //Salida
        System.out.println("");
        System.out.println("Area: " + a);

    }
}
