package EjerciciosPropuestos.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Propuesto32 {

    public static void main(String[] args) {

        /*Dado un rango de números enteros, obtener la cantidad de números pares e impares que
        contiene el rango, sin considerar los múltiplos de 5.*/

        //Variables
        int numeroInicial, numeroFinal;
        int contadorPar = 0;
        int contadorImpar = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número de inicial");
        numeroInicial = teclado.nextInt();
        System.out.println("Ingrese número final");
        numeroFinal = teclado.nextInt();

        //Proceso
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 5 == 0) {
                continue;
            }

            if (i % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de números pares: " + contadorPar);
        System.out.println("Cantidad de números impares: " + contadorImpar);
    }
}

