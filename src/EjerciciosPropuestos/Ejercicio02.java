package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Dado dos números enteros, determinar cuántos números enteros están incluidos en ellos.

        //Variables
        int primerNumero, segundoNumero;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número");
        primerNumero = teclado.nextInt();
        segundoNumero = 0;

        //Proceso
        while (primerNumero >= segundoNumero) {
            System.out.println("Ingrese otro número");
            segundoNumero = teclado.nextInt();
        }

        while (segundoNumero > primerNumero) {
            System.out.println(segundoNumero);
            segundoNumero = segundoNumero - 1;
        }

        //Salida
        System.out.println(segundoNumero);
    }
}
