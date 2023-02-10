package EjerciciosPropuestos.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Propuesto31 {

    public static void main(String[] args) {

        /*Enunciado: Obtener el factorial de un número, recuerde que el factorial de un número es el producto de
        1 X 2 X 3 X .. . X N.*/

        //Variables
        int numero, factorial = 1;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número");
        numero = teclado.nextInt();

        //Proceso
        if (numero == 0) {
            System.out.println("El factorial de " + numero + " es 1");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
        }

        //Salida
        System.out.println();
        System.out.println("El factorial de " + numero + " es " + factorial);

    }
}
