package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema44 {

    public static void main(String[] args) {

        // Obtener la cantidad de los primeros N números múltiplos de 5.

        //Variables
        int iterador, numero, cantidad = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero : ");
        numero = teclado.nextInt();

        //Proceso
        iterador = 1;
        while (iterador <= numero) {
            if (iterador % 5 == 0) {
                cantidad += 1;
            }
            iterador++;
        }
        // Salida
        System.out.println("");
        System.out.println("Cantidad: " + cantidad);


    }
}
