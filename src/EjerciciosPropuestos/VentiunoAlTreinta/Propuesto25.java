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

        Determine mediante un programa, cuál será el monto del descuento al sueldo ingresado de un trabajador.

        */

        //Variables
        int sueldo, descuento;
        char trabajador, sexo;


        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sueldo");
        sueldo = scanner.nextInt();
        System.out.println("Ingrese tipo de trabajador: 1 si es Obrero o 2 si es Empleado.");
        trabajador = scanner.next().charAt(0);
        System.out.println("Ingrese sexo: 1 si es hombre o 2 si es mujer.");
        sexo = scanner.next().charAt(0);

        //Proceso
        if (trabajador == 1 && sexo == 1){

        }

        //Salida
        System.out.println();
        System.out.println("El descuento corresponde al "  );

    }
}

