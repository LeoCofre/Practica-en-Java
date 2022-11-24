package EjerciciosJava.UnoAlDiez;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        //Calcular el interés compuesto generado por un capital depositado durante cierta cantidad de
        //tiempo, a una tasa de interés determinada.

        //Variables
        float c, r, t, i, m;

        //Entrada

        Scanner teclado = new Scanner(System.in);
        System.out.print("Capital: ");
        c = teclado.nextFloat();
        System.out.print("Tasa de interes: ");
        r = teclado.nextFloat();
        System.out.print("Tiempo: ");
        t = teclado.nextFloat();

        //Proceso
        m = (float) (Math.pow(1 + r / 100, t)) * c;
        i = m - c;

        // Salida
        System.out.println("");
        System.out.println("Interes: " + i);
        System.out.println("Monto: " + m);
    }
}
