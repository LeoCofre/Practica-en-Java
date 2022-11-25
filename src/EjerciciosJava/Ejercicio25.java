package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        //Dado la hora, minuto y segundo, encuentre la hora del siguiente segundo.

        //Variables
        int hora, minuto, segundo;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese hora: ");
        hora = scanner.nextInt();
        System.out.println("Ingrese minuto: ");
        minuto = scanner.nextInt();
        System.out.println("Ingrese segundo: ");
        segundo = scanner.nextInt();

        //Proceso
        segundo += 1;

        if (segundo == 60) {
            segundo = 0;
            minuto += 1;
            if (minuto == 60) {
                minuto = 0;
                hora += 1;
            }
        }

        //Salida
        System.out.println("Horas: " + hora + " Minutos: " + minuto + "Segundos" + segundo);


    }
}
