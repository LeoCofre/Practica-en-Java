package ProblemasJava.OnceAlVeinte;

import java.util.Scanner;

public class Problema16 {

    public static void main(String[] args) {

        //Dados tres números enteros, devolver el número mayor.

        //Variables
        int primerNumero, segundoNumero, tercerNumero, numeroMayor;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo numero");
        segundoNumero = scanner.nextInt();
        System.out.println("Ingrese tercer numero");
        tercerNumero = scanner.nextInt();

        //Proceso
        if (primerNumero > segundoNumero) {
            if (primerNumero > tercerNumero) {
                numeroMayor = primerNumero;
            } else {
                numeroMayor = tercerNumero;
            }
        } else {
            if (segundoNumero > tercerNumero) {
                numeroMayor = segundoNumero;
            } else {
                numeroMayor = tercerNumero;
            }
        }

        //Salida
        System.out.println("");
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
