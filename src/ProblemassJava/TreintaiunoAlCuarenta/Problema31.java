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
        int p;
        String e = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese promedio de notas obtenido");
        p = teclado.nextInt();


        //Proceso
        if (p >= 0 && p <= 5) {
            e = " PESIMO";
        } else if (p >= 6 && p <= 10) (
                e = " MALO";
        }else if(p >=11&&p <=14){
        e = " REGULAR";
    }else if(p >=15&&p <=17)

    {
        e = "BUENO";
    }else if(p >=18&&p <=20)

    {
        e = " EXCELENTE";
    }

}
}