package EjerciciosJava.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        // Determinar si un número es múltiplo de 3 y 5.

        //Variables
        int numero;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número");
        numero = scanner.nextInt();

        //Proceso
        System.out.println("");
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número " + numero + " es multiplo de 3 y de 5");
        } else {
            System.out.println("El número ingresado no es multiplo de 3 y 5");
        }

        //Salida
        System.out.println("");
        System.out.println(respuesta);
    }
}
