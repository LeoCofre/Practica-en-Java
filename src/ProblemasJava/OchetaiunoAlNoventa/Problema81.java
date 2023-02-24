package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema81 {

    public static void main(String[] args) {

        /*Busque un número dentro de una matriz de 4x3, determine la posición y si existe o no el
        número buscado. Use el método de búsqueda secuencial.*/

        //Variables
        int nb, i, j, pl, p2;
        String r;

        //Arreglos
        int[][] numeros = new int[4][3];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero (0,0): ");
        numeros[0][0] = teclado.nextInt();
        System.out.print("Numero (0,1): ");
        numeros[0][1] = teclado.nextInt();
        System.out.print("Numero (0,2): ");
        numeros[0][2] = teclado.nextInt();
        System.out.print("Numero (1,0): ");
        numeros[1][0] = teclado.nextInt();
        System.out.print("Numero (1,1): ");
        numeros[1][1] = teclado.nextInt();
        System.out.print("Numero (1,2): ");
        numeros[1][2] = teclado.nextInt();
        System.out.print("Numero (2,0): ");
        numeros[2][0] = teclado.nextInt();
        System.out.print("Numero (2,1): ");
        numeros[2][1] = teclado.nextInt();
        System.out.print("Numero (2,2): ");
        numeros[2][2] = teclado.nextInt();
        System.out.print("Numero (3,0): ");
        numeros[3][0] = teclado.nextInt();
        System.out.print("Numero (3,1): ");
        numeros[3][1] = teclado.nextInt();
        System.out.print("Numero (3,2): ");
        numeros[3][2] = teclado.nextInt();
        System.out.println("Numero a buscar");
        nb = teclado.nextInt();
    }
}
