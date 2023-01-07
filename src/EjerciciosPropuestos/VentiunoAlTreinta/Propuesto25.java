package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Objects;
import java.util.Scanner;

public class Propuesto25 {

    public static void main(String[] args) {

        //En una empresa se ha determinado la siguiente política de descuento.

        /*                  Sexo
                       Hombre   Mujer
        Tarjeta
        Obrero          15%      10%
        Empleado        20%      15%

        */

        //Variables
        String tipoTarjeta, sexo;
        int descuento = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tipo de tarjeta: Obrero o Empleado");
        tipoTarjeta = scanner.nextLine();
        System.out.println("Ingrese sexo: Hombre o Mujer");
        sexo = scanner.nextLine();

        //Proceso
        if (tipoTarjeta.equals("Obrero") && sexo.equals("Hombre")) {
            descuento = 15;
        } else if (tipoTarjeta.equals("Obrero") && sexo.equals("Mujer")) {
            descuento = 10;
        } else if (tipoTarjeta.equals("Empleado") && sexo.equals("Hombre")) {
            descuento = 20;
        } else if (tipoTarjeta.equals("Empleado") && sexo.equals("Mujer")) {
            descuento = 15;
        } else {
            System.out.println("Valores ingresados no validos");
        }

        //Salida
        System.out.println();
        System.out.println("El descuento corresponde al " + descuento + "%");

    }
}

