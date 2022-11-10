package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        //Calcular el interés compuesto generado por un capital depositado durante cierta cantidad de tiempo

        //Variables
        float capital, tasaInteres, tiempo, interes, monto;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Capital: ");
        capital = teclado.nextFloat();
        System.out.print("Tasa de interes: ");
        tasaInteres = teclado.nextFloat();
        System.out.print("Tiempo: ");
        tiempo = teclado.nextFloat();

        //Proceso
        monto = (float) (Math.pow(1 + tasaInteres / 100, tiempo)) * capital;
        interes = monto - capital;

        //Salida
        System.out.println("");
        System.out.println("Interes: " + interes);
        System.out.println("Monto : " + monto);
    }
}
