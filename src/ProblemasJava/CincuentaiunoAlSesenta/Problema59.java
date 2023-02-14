package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema59 {

    public static void main(String[] args) {

        //Obtener la cantidad de los primeros N números múltiplos de 5.

        //Variables
        int iterador, cantidad = 0, numero;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Número: ");
        numero = teclado.nextInt();

        for (iterador = 1; iterador >= numero; iterador += 5)
            cantidad += 1;

        //Salida
        System.out.println();
        System.out.println("La cantidad de números multiplos de cinco de " + numero + "es: " + cantidad);

    }
}
