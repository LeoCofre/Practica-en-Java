package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema79 {

    public static void main(String[] args) {

        /*Ingrese 12 números en un arreglo bidimensional (matriz) de 4x3, y obtenga la suma de cada
        columna.*/

        //Variables
        int sumaColumnaCero = 0, sumaColumnaUno = 0, sumaColumnaDos = 0, i, j;

        //Arreglos
        int[][] numeros = new int[4][3];

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número (0,0)");
        numeros[0][0] = scanner.nextInt();
        System.out.println("Número (0,1)");
        numeros[0][1] = scanner.nextInt();
        System.out.println("Número (0,2)");
        numeros[0][2] = scanner.nextInt();
        System.out.println("Número (1,0)");
        numeros[1][0] = scanner.nextInt();
        System.out.println("Número (1,1)");
        numeros[1][1] = scanner.nextInt();
        System.out.println("Número (1,2)");
        numeros[1][2] = scanner.nextInt();
        System.out.println("Número (2,0)");
        numeros[2][0] = scanner.nextInt();
        System.out.println("Número (2,1)");
        numeros[2][1] = scanner.nextInt();
        System.out.println("Número (2,2)");
        numeros[2][2] = scanner.nextInt();
        System.out.println("Número (3,0)");
        numeros[3][0] = scanner.nextInt();
        System.out.println("Número (3,1)");
        numeros[3][1] = scanner.nextInt();
        System.out.println("Número (3,2)");
        numeros[3][2] = scanner.nextInt();

        //Proceso
        for (i = 0; i <= 3; i++)
            sumaColumnaCero += numeros[i][0];
        sumaColumnaUno += numeros[i][1];
        sumaColumnaDos += numeros[i][2];

        //Salida
        System.out.println();
        System.out.println("La suma de la columna '0' es: " + sumaColumnaCero);
        System.out.println("La suma de la columna '1' es: " + sumaColumnaUno);
        System.out.println("La suma de la columna '2' es: " + sumaColumnaDos);
    }
}

