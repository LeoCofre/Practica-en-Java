package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        //Dada una cantidad de milímetros, expresarlo en la máxima cantidad de metros, el resto en
        //decímetros, centímetros y milímetros.

        //Constantes

        final float METROS = 1000;
        final float DECIMETROS = 100;
        final float CENTIMETROS = 10;


        // Variables
        float milimetros, resultadoMetros, resultadoDecimetros, resultadoCentimetros, resultadoMilimetros;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidas de milimetros");
        milimetros = teclado.nextFloat();

        //Proceso
        resultadoMetros = milimetros / METROS;
        milimetros = milimetros % METROS;
        resultadoDecimetros = milimetros / DECIMETROS;
        milimetros = milimetros % DECIMETROS;
        resultadoCentimetros = milimetros / CENTIMETROS;
        resultadoMilimetros = milimetros % CENTIMETROS;


        //Salida
        System.out.println("Metros: " + resultadoMetros);
        System.out.println("Decimetros: " + resultadoDecimetros);
        System.out.println("Centimetros: " + resultadoCentimetros);
        System.out.println("Milimetros: " + resultadoMilimetros);

    }
}
