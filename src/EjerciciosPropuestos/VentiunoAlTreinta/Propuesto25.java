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
        int descuento;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tipo de tarjeta: Obrero o Empleado");
        tipoTarjeta = scanner.nextLine();
        System.out.println("Ingrese sexo: Hombre o Mujer");
        sexo = scanner.nextLine();

        //Proceso
        if (tipoTarjeta.equals("Obrero") || tipoTarjeta.equals("OBRERO")) {
            if (sexo.equals("Hombre") || sexo.equals("HOMBRE")) {
                descuento = 15;
            } else if (sexo.equals("Mujer") || sexo.equals("MUJER")) {
                descuento = 10;


            }

        }


    }
}
