package ProblemasJava.OnceAlVeinte;

import java.util.Scanner;

public class Problema18 {

    public static void main(String[] args) {

        //Dados 3 números, devolver los números en orden ascendente.

        //Variables
        int primerNumero, segundoNumero, tercerNumero, numeroMayor, numeroIntermedio, numeroMenor;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo número: ");
        segundoNumero = scanner.nextInt();
        System.out.println("Ingrese tercer número: ");
        tercerNumero = scanner.nextInt();

        //Proceso
        if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
            numeroMayor = primerNumero;
        } else {
            if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
                numeroMayor = segundoNumero;
            } else
                numeroMayor = tercerNumero;
        }

        if (primerNumero < segundoNumero && primerNumero < tercerNumero) {
            numeroMenor = primerNumero;
        } else {
            if (segundoNumero < primerNumero && segundoNumero < tercerNumero) {

                numeroMenor = segundoNumero;
            } else {
                numeroMenor = tercerNumero;
            }
        }
        numeroIntermedio = (primerNumero + segundoNumero + tercerNumero) - (numeroMayor + numeroMenor);

        // Salida
        System.out.println("");
        System.out.println("Mayor : " + numeroMayor);
        System.out.println("Intermedio : " + numeroIntermedio);
        System.out.println("Menor : " + numeroMenor);
    }

}

