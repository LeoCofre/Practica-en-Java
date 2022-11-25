package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        //Convertir grados sexagesimales a centesimales.

        //Variables
        double sexagesimal, centesimal;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero sexagesimal. ");
        sexagesimal = teclado.nextInt();

        //Proceso
        centesimal = ((200 * sexagesimal) / 180);

        //Salida
        System.out.println("Los grados centesimales para " + sexagesimal + " es " + centesimal);

    }
}
