package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

@SuppressWarnings("ConstantConditions")
public class Problema74 {

    public static void main(String[] args) {

        //Dado 5 números, obtener la cantidad de números primos ingresados.

        //Variables
        int cantidadPrimos = 0, i, j;
        boolean flag = false;

        //Arreglos
        int[] numeros = new int[5];

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        numeros[0] = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        numeros[1] = scanner.nextInt();
        System.out.println("Ingrese tercer número");
        numeros[2] = scanner.nextInt();
        System.out.println("Ingrese cuarto número");
        numeros[3] = scanner.nextInt();
        System.out.println("Ingrese quinto número");
        numeros[4] = scanner.nextInt();

        //Proceso
        for (i = 0; i <= 4; i++) {
            flag = true;
        }

        for (j = 2; j <= numeros[i] / 2; j++) {
            if (numeros[i] % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            cantidadPrimos += 1;
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de números primos: " + cantidadPrimos);
    }
}



