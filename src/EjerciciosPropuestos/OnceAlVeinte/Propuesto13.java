package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Propuesto13 {

    public static void main(String[] args) {

        // Dados dos números, determinar si son iguales o son diferentes.

        //Variables
        int primerNumero, segundoNumero;
        String respuesta;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        segundoNumero = scanner.nextInt();

        //Proceso
        if (primerNumero == segundoNumero) {
            respuesta = "iguales";
        } else {
            respuesta = "diferentes";
        }

        //Salida
        System.out.println("Los números ingresados son " + respuesta);
    }
}
