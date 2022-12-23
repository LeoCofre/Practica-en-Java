package ProblemasJava.OnceAlVeinte;

import java.util.Scanner;

public class Problema19 {

    public static void main(String[] args) {

        /*Un restaurante ofrece un descuento del 10 % para consumos de hasta S/.100.00 y un
        descuento de 20% para consumos mayores. Para ambos casos se aplica un impuesto del 19 %. Determinar
        el monto del descuento, el impuesto y el importe a pagar.*/

        //Constantes
        final float DESCUENTO_DIEZ_PORCIENTO = 0.1F;
        final float DESCUENTO_VEINTE_PORCIENTO = 0.2F;
        final float IVA = 0.19F;

        //Variables
        float consumo, montoDescuento, montoIva, total;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese monto de consumo: ");
        consumo = teclado.nextFloat();

        //Proceso
        if (consumo <= 100) {
            montoDescuento = consumo * DESCUENTO_DIEZ_PORCIENTO;
        } else {
            montoDescuento = consumo * DESCUENTO_VEINTE_PORCIENTO;
        }

        montoIva = (consumo - montoDescuento) * IVA;
        total = consumo - montoDescuento + montoIva;

        //Salida
        System.out.println(" ");
        System.out.println("Monto descuento : " + montoDescuento);
        System.out.println("Impuesto IVA : " + montoIva);
        System.out.println("Total a pagar : " + total);

    }
}
