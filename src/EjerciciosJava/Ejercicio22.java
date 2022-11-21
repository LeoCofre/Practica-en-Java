package EjerciciosJava;

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
        final float DESC_G = 0.15F;
        final float DESC_A = 0.2F;
        final float REC_G = 0.1F;
        final float REC_A = 0.05F;

        //Variables
        float mc, m, tp;
        char tc, fp;
        String r;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Monto de compra : ");
        mc = teclado.nextFloat();
        System.out.print(" Tipo de cliente : ");
        tc = teclado.next().charAt(0);
        System.out.print(" Forma de pago : ");
        fp = teclado.next().charAt(0);

        //Proceso
        if (tc == 'G') {
            if (fp == 'C') {
                m = mc * DESC_G;
                tp = mc - m;
                r = "DESCUENTO 15%";
            } else {
                m = mc * REC_G;
                tp = mc + m;
                r = " RECARGO 10% u";
            }
            if (fp == 'C') {
                m = mc * DESC_A;
                tp = mc - m;
                r = "DESCUENTO 20%";
            } else {
                m = mc * REC_A;
                tp = mc + m;
                r = " RECARGO 5%";
            }
        }
    }
}
