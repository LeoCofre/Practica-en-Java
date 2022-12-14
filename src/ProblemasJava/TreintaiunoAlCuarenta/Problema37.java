package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema37 {

    public static void main(String[] args) {

        /*Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de tres dados en
        base a la cantidad de seis obtenidos, de acuerdo a lo siguiente:

                             Tres seis: Oro
                             Dos seis: Plata
                             Un seis: Bronce
                             Ningún seis: Perdió*/

        //Variables
        int primerDado, segundoDado, tercerDado;
        String premio = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primer dado: ");
        primerDado = teclado.nextInt();
        System.out.print("Segundo dado: ");
        segundoDado = teclado.nextInt();
        System.out.print("Tercer dado: ");
        tercerDado = teclado.nextInt();

        //Proceso
        if (primerDado == 6 && segundoDado == 6 && tercerDado == 6) {
            premio = "Oro";
        } else if (primerDado == 6 && segundoDado == 6 || segundoDado == 6 && tercerDado == 6
                || primerDado == 6 && tercerDado == 6) {
            premio = "Plata";
        } else if (primerDado == 6 || segundoDado == 6 || tercerDado == 6) {
            premio = "Bronce";
        } else {
            premio = "Perdió";
        }

        //Salida
        System.out.println("");
        System.out.println("El premio es: " + premio);
    }
}
