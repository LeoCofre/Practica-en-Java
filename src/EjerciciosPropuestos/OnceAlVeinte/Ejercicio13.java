package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        //Dados dos números enteros, devolver el número menor.

        //Variables
        int primerNumero, segundo_numero, numeroMenor;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo número: ");
        segundo_numero = scanner.nextInt();

        //Proceso
        if (primerNumero < segundo_numero){
            numeroMenor = primerNumero;
        }else {
            numeroMenor = segundo_numero;
        }

        //Salida
        System.out.println("El número menor es: " + numeroMenor);



    }
}
