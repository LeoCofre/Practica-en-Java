package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Propuesto07 {

    public static void main(String[] args) {

        //Dada una cantidad de horas, obtener su equivalente en minutos y segundos.


        //Variables
        int minuto = 60;
        int segundo = 360;
        int horas, resultadoMinuto, resultadoSegundo;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas a calcular: ");
        horas = teclado.nextInt();

        //Proceso
        resultadoMinuto = horas * minuto;
        resultadoSegundo = horas * segundo;


        //Salida
        System.out.println("La cantidad de horas ingresadas equivale a: " + resultadoMinuto + " minutos y "
                + resultadoSegundo + " segundos");

    }
}
