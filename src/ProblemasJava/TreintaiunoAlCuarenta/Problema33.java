package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema33 {

    public static void main(String[] args) {

        //En una universidad se ha establecido los siguientes puntajes de ingreso para sus respectivas facultades:

        /* Facultad               Puntaje mínimo

           Sistemas                   100
           Electrónica                 90
           Industrial                  80
           Administración              70 */

        /*De acuerdo al puntaje obtenido por un postulante, determinar la facultad a la cual ingresó o dar un
        mensaje correspondiente para el caso que no ingrese.*/

        //Variables
        int puntaje;
        String facultad = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese puntaje");
        puntaje = teclado.nextInt();

        //Proceso
        if (puntaje >= 70 && puntaje <= 79) {
            facultad = "Administración";
        } else if (puntaje >= 80 && puntaje <= 89) {
            facultad = "Industrial";
        } else if (puntaje >= 90 && puntaje <= 99) {
            facultad = "Electronica";
        } else if (puntaje >= 100) {
            facultad = "Sistemas";
        } else {
            facultad = "Ninguna";
        }

        //Salida
        System.out.println("");
        System.out.println("La facultad es: " + facultad);

    }
}
