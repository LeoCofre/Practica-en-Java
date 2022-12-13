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
        if(promedioNotas >= 0 && promedioNotas <= 5) {
            categoria= " PESIMO";
        }else if(promedioNotas >= 6 && promedioNotas <= 10) (
                categoria = " MALO";
    }else if ( >= 11 && p <= 14) {
        ca =
                " REGULAR";
    }else if(p >= 15 && p <= 17) {
        e = "BUENO";
    }else if(p >= 18 && p <= 20) {
        e = " EXCELENTE";
        }

        //Salida
        System.out.println("");
        System.out.println("El promedio obtenido es : " + categoria);


    }
}

