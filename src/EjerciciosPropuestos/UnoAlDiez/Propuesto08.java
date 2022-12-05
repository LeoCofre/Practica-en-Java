package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Propuesto08 {

    public static void main(String[] args) {

        //Convertir una cantidad de grados Fahrenheit a Celsius y Kelvin.

        //Constantes
        final double KELVIN = 255.928f;

        //Variables
        double fahrenheit;
        double resultadoCelsius, resultadokelvin;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de grados fahrenheit");
        fahrenheit = teclado.nextInt();

        //Proceso
        resultadoCelsius = fahrenheitToCelsius(fahrenheit);
        resultadokelvin = fahrenheitToKelvin(fahrenheit);

        //salida
        System.out.println("La cantidad de grados fahrenheit equivale a: " + resultadoCelsius + " grados celsius y "
                + resultadokelvin + " grados kelvin");

    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (((fahrenheit - 32) * 5 / 9) + 273.15);
    }
}
