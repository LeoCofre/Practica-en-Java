package ProblemassJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema31<promedioNotas> {

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
        if (promedioNotas >= 0 && promedioNotas <= 5) {
            categoria = " PESIMO";
        } else if (promedioNotas >= 6 && promedioNotas <= 10) {
            categoria = " MALO";
        } else if (promedioNotas >= 11 && promedioNotas <= 14) {
            categoria = " REGULAR";
        } else if (promedioNotas >= 15 && promedioNotas <= 17) {
            categoria = "BUENO";
        } else if (promedioNotas >= 18 && promedioNotas <= 20) {
            categoria = " EXCELENTE";
        }

        //Salida
        System.out.println("");
        System.out.println("Su promedio es :" + categoria);
    }
}