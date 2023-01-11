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

        double kilo, precio, total, descuento = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de kilos de manzana:");
        kilo = scanner.nextDouble();
        System.out.println("Ingrese precio del kilo de manzanas:");
        precio = scanner.nextDouble();
        total = precio * kilo;

        //Proceso
        if (kilo <= 2) {
            descuento = 0;
        } else if (kilo >= 2.01 && kilo <= 5) {
            descuento = total * 0.10;
            System.out.println("Se aplico un 10% de descuento");
        } else if (kilo >= 5.01 && kilo <= 10) {
            descuento = total * 0.15;
            System.out.println("Se aplico un 15% de descuento");
        } else {
            descuento = total * 0.20;
            System.out.println("Se aplico un 20% de descuento");
        }

        //Salida
        System.out.println();
        System.out.println("El descuento aplicado es: " + descuento);
    }
}

