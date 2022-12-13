package ProblemassJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema31 {

    public static void main(String[] args) {

        /*Dado la nota promedio de un alumno, obtener la categoría, según la siguiente tabla.

            Promedio Categoría
            Entre O Y 5 Pésimo
            Entre 6 Y 10 Malo
            Entre 11 Y 14 Regular
            Entre 15 Y 17 Bueno
            Entre 18 y 20 Excelente*/

        //Variables
        int promedioNotas;
        String categoria = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese promedio de notas obtenido");
        promedioNotas = teclado.nextInt();

        //Proceso
        switch (promedioNotas) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                categoria = "Pésimo";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                categoria = "Malo";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                categoria = "Regular";
                break;
            case 15:
            case 16:
            case 17:
                categoria = "Bueno";
                break;
            case 18:
            case 19:
            case 20:
                categoria = "Excelente";

        }

        //Salida
        System.out.println("");
        System.out.println("El promedio obtenido es : " + categoria);


    }
}

