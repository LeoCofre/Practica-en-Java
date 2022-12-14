package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto26 {

    public static void main(String[] args) {

       /* Una frutería ofrece las manzanas con descuento, según la siguiente tabla:

            Kilos       %Descuento
            0-    2            0%
            2.01- 5           10%
            5.01- 10          20%
            Mayor a 10        30%

          Determinar cuánto pagará una persona que compre manzanas en esa frutería.*/

        //Variables
        int kilo;
        float precio, total, descuento = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de kilos de manzana:");
        kilo = scanner.nextInt();
        System.out.println("Ingrese precio del kilo de manzanas:");
        precio = scanner.nextFloat();
        total = precio * kilo;

        //Proceso
        if (kilo <= 2f) {
            descuento = 0f;
        } else if (kilo >= 2.01f && kilo <= 5f) {
            descuento = total * 0.10f;
            System.out.println("Se aplico un 10% de descuento");
        } else if (kilo >= 5.01f && kilo <= 10f) {
            descuento = total * 0.15f;
            System.out.println("Se aplico un 15% de descuento");
        } else {
            descuento = total * 0.20f;
            System.out.println("Se aplico un 20% de descuento");
        }

        //Salida
        System.out.println();
        System.out.println("El descuento aplicado es: " + descuento);
    }
}

