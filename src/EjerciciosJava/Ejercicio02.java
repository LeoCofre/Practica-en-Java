package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Hallar el cociente y el residuo (resto) de dos números enteros.

        //Variables
        int numero1, numero2, cociente, residuo;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1");
        numero1 = teclado.nextInt();
        System.out.println("Numero 2");
        numero2 = teclado.nextInt();

        //Proceso
        cociente = numero1 / numero2;
        residuo = numero1 % numero2;

        //Salida
        System.out.println("");
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: "+ residuo);

    }
}
