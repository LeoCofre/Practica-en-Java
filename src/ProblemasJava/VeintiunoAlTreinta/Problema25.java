package ProblemasJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Problema25 {

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
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        //Salida
        System.out.println("");
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + minuto);
        System.out.println("Segundos: " + segundo);


    }
}
