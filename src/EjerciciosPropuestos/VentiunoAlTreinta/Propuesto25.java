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
        char tipoTarjeta;
        int descuento = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tipo de tarjeta: ");
        System.out.println("1: Obrero ");
        System.out.println("2: Obrera ");
        System.out.println("3: Empleado ");
        System.out.println("4: Empleada");
        tipoTarjeta = scanner.next().charAt(0);


        //Proceso
        switch (tipoTarjeta) {
            case 1:
                descuento = 15;
                break;
            case 2:
                descuento = 10;
                break;
            case 3:
                descuento = 20;
                break;
            case 4:
                descuento = 15;
                break;
        }

        //Salida
        System.out.println();
        System.out.println("El descuento corresponde al " + descuento + "%");

    }
}

