package ProblemassJava.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        /*Debido a los excelentes resultados, el restaurante decide ampliar sus ofertas de acuerdo a
        la siguiente escala de consumo (ver tabla). Determinar el monto del descuento, el importe del impuesto
        y el importe a pagar.*/

        //Constantes
        final float DESCUENTO_UNO = 0.1F;
        final float DESCUENTO_DOS = 0.2F;
        final float DESCUENTO_TRES = 0.3F;
        final float IVA = 0.19F;

        //Variables
        float consumo, montoDescuento, montoIva, total;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Consumo: ");
        consumo = teclado.nextFloat();

        //Proceso
        if (consumo > 200) {
            montoDescuento = consumo * DESCUENTO_TRES;
        } else {
            if (consumo > 100) {
                montoDescuento = consumo * DESCUENTO_DOS;
            } else {
                montoDescuento = consumo * DESCUENTO_UNO;
            }

        }

        montoIva = (consumo - montoDescuento) * IVA;
        total = consumo - montoDescuento + montoIva;

        //Salida
        System.out.println("");
        System.out.println("Monto descuento : " + montoDescuento);
        System.out.println("Impuesto IGV : " + montoIva);
        System.out.println("Importe a pagar : " + total);


    }
}
