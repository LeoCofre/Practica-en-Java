package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        //Al ingresar el valor de una temperatura, obtener el tipo de clima según la siguiente tabla.

        /*Temperatura Tipo de clima
        Temp. < 10 Frío
        Temp. Entre 10 Y 20 Nublado
        Temp. Entre 21 Y 30 Calor
        Temp. > 30 Tropical*/

        //Variables
        int t;
        String c;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Temperatura : ");
        t = teclado.nextInt();

        //Proceso
        if (t < 10) {
            c = "FRIO";
        } else {
            if (t >= 10 && t <= 20) {
                c = "NUBLADO";
            } else {
                if (t >= 21 && t <= 30) {
                    c = "CALOR";
                } else {
                    c = " TROPICAL";
                }
            }
        }

        //Salida
        System.out.println("");
        System.out.println("Clima : " + c);


    }
}


