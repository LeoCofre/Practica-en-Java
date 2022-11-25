package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        //Calculos de formulas matematicas

        //Variables
        int a, b;
        double c, d;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor de a: ");
        a = teclado.nextInt();
        System.out.println("Ingrese valor de b: ");
        b = teclado.nextInt();

        //Proceso
        c = ((double) 4 * Math.pow(a, 4) + 3 * b * a + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
        d = ((double) 4 * Math.pow(c, 2) + a + b) / 4;

        //Salida
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de d es: " + d);

    }
}
