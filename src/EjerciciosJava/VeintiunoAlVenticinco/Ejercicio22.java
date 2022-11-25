package EjerciciosJava.VeintiunoAlVenticinco;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        /*Un negocio tiene dos tipos de cliente: cliente general (G) y cliente afiliado (A). Acepta dos
        formas de pago: al contado (C) y en plazos (P). Nos piden crear un programa que al ingresar el monto de
        la compra se obtenga el monto del descuento o el monto del recargo y el total a pagar, según la siguiente
        tabla. */

        /*Tipo______________Contado (C)___________ Plazos (P)
                            descuento              recargo
        Cliente general (G)     15 %                10%
        Cliente afiliado (A)    20%                 5%*/


        //Constantes
        final float DESCUENTO_GENERAL = 0.15F;
        final float DESCUENTO_ASOCIADO = 0.2F;
        final float RECARGO_GENERAL = 0.1F;
        final float RECARGO_ASOCIADO = 0.05F;

        //Variables
        float montoCompra, montoDescRecargo = 0, pagoTotal = 0;
        char tipoCliente, formaPago;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Monto de compra: ");
        montoCompra = scanner.nextFloat();
        System.out.print("Tipo de cliente : ");
        tipoCliente = scanner.next().charAt(0);
        System.out.print("Forma de pago : ");
        formaPago = scanner.next().charAt(0);

        //Proceso
        if (tipoCliente == 'G') {
            if (formaPago == 'C') {
                montoDescRecargo = montoCompra * DESCUENTO_GENERAL;
                pagoTotal = montoCompra - montoDescRecargo;
                respuesta = "DESCUENTO 15%";
            } else {
                montoDescRecargo = montoCompra * RECARGO_GENERAL;
                pagoTotal = montoCompra + montoDescRecargo;
                respuesta = "RECARGO 10% ";
            }
            if (formaPago == 'C') {
                montoDescRecargo = montoCompra * DESCUENTO_ASOCIADO;
                pagoTotal = montoCompra - montoDescRecargo;
                respuesta = "DESCUENTO 20%";
            } else {
                montoDescRecargo = montoCompra * RECARGO_ASOCIADO;
                pagoTotal = montoCompra + montoDescRecargo;
                respuesta = " RECARGO 5%";
            }
        }
        //Salida
        System.out.println("");
        System.out.println(respuesta + " : " + montoDescRecargo);
        System.out.println(" Total a pagar : " + pagoTotal);
    }
}
