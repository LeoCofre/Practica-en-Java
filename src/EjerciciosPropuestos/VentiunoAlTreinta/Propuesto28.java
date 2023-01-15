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
        int cargo, tiempoDeServicio, utilidades;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese años de servicio: ");
        tiempoDeServicio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese cargo de trabajador");
        System.out.println("1.- Administrador");
        System.out.println("2.- Contador");
        System.out.println("3.- Empleado");

        //Proceso
        do {
            cargo = scanner.nextInt();
            scanner.nextLine();
            if (cargo < 1 || cargo > 3)
                System.out.print("Valor incorrecto, ingreselo nuevamente: ");
        } while (cargo < 1 || cargo > 3);
        utilidades = 0;
        if (cargo == 1 && tiempoDeServicio <= 2)
            utilidades = 2000;
        if (cargo == 1 && tiempoDeServicio > 2 && tiempoDeServicio <= 5)
            utilidades = 2500;
        if (cargo == 1 && tiempoDeServicio > 5 && tiempoDeServicio <= 8)
            utilidades = 3000;
        if (cargo == 1 && tiempoDeServicio > 8)
            utilidades = 4000;
        if (cargo == 2 && tiempoDeServicio <= 2)
            utilidades = 1500;
        if (cargo == 2 && tiempoDeServicio > 2 && tiempoDeServicio <= 5)
            utilidades = 2000;
        if (cargo == 2 && tiempoDeServicio > 5 && tiempoDeServicio <= 8)
            utilidades = 2500;
        if (cargo == 2 && tiempoDeServicio > 8)
            utilidades = 3500;
        if (cargo == 3 && tiempoDeServicio <= 2)
            utilidades = 1000;
        if (cargo == 3 && tiempoDeServicio > 2 && tiempoDeServicio <= 5)
            utilidades = 1500;
        if (cargo == 3 && tiempoDeServicio > 5 && tiempoDeServicio <= 8)
            utilidades = 2000;
        if (cargo == 3 && tiempoDeServicio > 8)
            utilidades = 2500;
        System.out.println("Valor de utilidades: " + utilidades);
    }
}

