package ProblemasJava.UnoAlDiez;

import java.util.Scanner;

public class Problema10 {

    public static void main(String[] args) {

        //convertir una cantidad de segundos en horas y el resto en  minutos y segundos.

        //Constantes
        final int HORA = 3600;
        final int MINUTO = 60;

        //Variables
        int segundos, resultadoHora, resultadoMinuto, resultadoSegundo;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tiempo en segundos");
        segundos = teclado.nextInt();

        //Proceso
        resultadoHora = segundos / HORA;
        segundos = segundos % HORA;
        resultadoMinuto = segundos / MINUTO;
        resultadoSegundo = segundos % MINUTO;

        //Salida
        System.out.println("");
        System.out.println("Horas: " + resultadoHora);
        System.out.println("Minutos: " + resultadoMinuto);
        System.out.println("Segundos: " + resultadoSegundo);

    }
}
