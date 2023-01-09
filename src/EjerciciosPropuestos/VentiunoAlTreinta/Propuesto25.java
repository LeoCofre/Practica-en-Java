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
        int sueldo, descuento = 0;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tipo de tarjeta: ");
        System.out.println("1: Obrero ");
        System.out.println("2: Obrera ");
        System.out.println("3: Empleado ");
        System.out.println("4: Empleada");
        

        //Proceso

        //Salida
        System.out.println();
        System.out.println("El descuento corresponde al " + descuento );

    }
}

