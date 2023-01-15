package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto28 {

    public static void main(String[] args) {

        /*Determinar el monto que recibirá un trabajador por utilidades, después de ingresar el tiempo
        de servicio y el cargo, según la siguiente tabla.


                                      _____________________Cargo___________________

        __Tiempo de servicio__        Administrador       Contador         Empleado
        Entre O y 2 años                  2000              1500            1000
        Entre 3 y 5 años                  2500              2000            1500
        Entre 6 y 8 años                  3000              2500            2000
        Mayor a 8 años                    4000              3500            1500
        */

        //Variables
        int cargo, tiempo, utilidades;


        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cargo del trabajador:  ");
        System.out.println("1 si es Administrador");
        System.out.println("2 si es Contador");
        System.out.println("3 si es Empleado");
        cargo = scanner.nextInt();
        System.out.println("Ingrese años de servicio");
        tiempo = scanner.nextInt();

        //Proceso
        if (cargo == 'A' || cargo == 'a' && tiempo <= 2){
            utilidades = 2000;
        }else if (cargo == 'C' || cargo == 'c' && tiempo >= 3 && tiempo <= 5){
            utilidades = 2500;

        }

    }
}
