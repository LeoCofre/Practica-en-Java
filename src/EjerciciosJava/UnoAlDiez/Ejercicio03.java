package EjerciciosJava.UnoAlDiez;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        //Dado el valor de un producto, hallar el IVA (19 %) y el precio de venta.

        //Constantes
        final float IVA;

        //Variables
        float valorProducto, precioVenta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor de producto : ");
        valorProducto = teclado.nextFloat();

        //Proceso
        IVA = valorProducto * .19f;
        precioVenta = valorProducto + IVA;

        //Salida
        System.out.println(" ");
        System.out.println(" IVA : " + IVA);
        System.out.println(" Precio de Venta : " + precioVenta);

    }
}
