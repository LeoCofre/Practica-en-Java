package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        //Dados 4 numeros enteros obtener el porcentaje de cada uno en funcion a la suma de los numeros ingresados.

        //Variables
        int primerNumero, segundoNumero, tercerNumero, cuartoNumero, suma, porcentPrimerNumero,
                porcentSegundoNumero, porcentTercerNumero, porcentCuartoNumero;

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero (a): ");
        primerNumero = teclado.nextInt();
        System.out.println("Ingrese segundo numero (b): ");
        segundoNumero = teclado.nextInt();
        System.out.println("Ingrese tercer numero (c):");
        tercerNumero = teclado.nextInt();
        System.out.println("Ingrese cuarto numero (d): ");
        cuartoNumero = teclado.nextInt();

        //Proceso

        suma = primerNumero + segundoNumero + tercerNumero + cuartoNumero;
        porcentPrimerNumero = Math.round((100 * ((float) primerNumero / (float) suma)));
        porcentSegundoNumero = Math.round((100 * ((float) segundoNumero / (float) suma)));
        porcentTercerNumero = Math.round((100 * ((float) tercerNumero / (float) suma)));
        porcentCuartoNumero = Math.round((100 * ((float) cuartoNumero / (float) suma)));

        //Salida
        System.out.println("El porcentaje del primer numero representa el " + porcentPrimerNumero + "% de la suma: " + suma);
        System.out.println("El porcentaje del segundo numero representa el " + porcentSegundoNumero + "% de la suma: " + suma);
        System.out.println("El porcentaje del tercer numero representa el " + porcentTercerNumero + "% de la suma: " + suma);
        System.out.println("El porcentaje del cuarto numero representa el " + porcentCuartoNumero + "% de la suma: " + suma);

    }
}
