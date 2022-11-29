package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

       /* Dado un número entero, devolver el doble del número si el número es positivo; el triple del
        número si es negativo; y cero si el número es neutro.*/

        //Variables
        int numero, respuesta;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero = scanner.nextInt();

        //Proceso
        if (numero > 0) {
            respuesta = numero * 2;
        } else if (numero < 0) {
            respuesta = numero * 3;
        } else {
            respuesta = 0;
        }

        //Salida
        System.out.println("");
        System.out.println("Resultado : " + respuesta);

    }

}
