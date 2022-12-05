package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Propuesto12 {

    public static void main(String[] args) {

        //Dados dos números enteros, devolver el número menor.

        //Variables
        int primerNumero, segundoNumero, numeroMenor;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número: ");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese otro número: ");
        segundoNumero = scanner.nextInt();

        //Proceso
        if (primerNumero > segundoNumero) {
            numeroMenor = segundoNumero;
        } else {
            numeroMenor = primerNumero;
        }

        //Salida
        System.out.println("El número menor es: " + numeroMenor);
    }
}
