package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        //convertir una cantidad de segundos en horas y el resto en  minutos y segundos.

        //Constantes
        final int HORA = 3600;
        final int MINUTO = 60;

        //Variables
        int tiempo, hora, minuto, segundo;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tiempo en segundos");
        tiempo = teclado.nextInt();

        //Proceso
        hora = tiempo / HORA;
        tiempo = tiempo % HORA;
        minuto = tiempo / MINUTO;
        segundo = tiempo % MINUTO;

        //Salida
        System.out.println("");
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + minuto);
        System.out.println("Segundos: " + segundo);

    }
}
