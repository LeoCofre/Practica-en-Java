package EjerciciosJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {

        /*Al ingresar el número de un mes, devolver la estación del año de acuerdo a la siguiente tabla.
        Mes Estación
        1, 2, 3 Verano
        4, 5, 6 Otoño
        7, 8, 9 Invierno
        10, 11, 12 Primavera*/

        //Variables
        int mes;
        String estacion = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número de mes del 1 al 12: ");
        mes = teclado.nextInt();

        //Proceso
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion ="Otoño";
                break;
            case 7:
            case 8:


        }


    }
}
