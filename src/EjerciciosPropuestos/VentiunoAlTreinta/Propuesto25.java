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
        int sueldo, descuento = 0;
        char trabajador, sexo;


        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sueldo");
        sueldo = scanner.nextInt();
        System.out.println("Ingrese tipo de trabajador: 'o' si es Obrero o 'e' si es Empleado.");
        trabajador = scanner.next().charAt(0);
        System.out.println("Ingrese sexo: 'h' si es hombre o 'm' si es mujer.");
        sexo = scanner.next().charAt(0);

        //Proceso
        if (trabajador == 'o' && sexo == 'h') {
            descuento = (sueldo * 15) / 100;
        } else if (trabajador == 'o' && sexo == 'm') {
            descuento = (sueldo * 10) / 100;
        } else if (trabajador == 'e' && sexo == 'h') {
            descuento = (sueldo * 20) / 100;
        } else if (trabajador == 'e' && sexo == 'm') {
            descuento = (sueldo * 15) / 100;
        }

        //Salida
        System.out.println();
        System.out.println("El monto del descuento es de " + descuento);

    }
}

