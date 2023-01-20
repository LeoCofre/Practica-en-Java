package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema41 {

    public static void main(String[] args) {

        //Obtener la suma de los primeros N números naturales positivos.

        //Variables
        int iterador, numero, suma = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        numero = teclado.nextInt();

        //Proceso
        iterador = 1;
        while (iterador <= numero) {
            suma = suma + iterador;
            iterador = iterador + 1;
        }

        //Salida
        System.out.println("");
        System.out.println("Suma: " + suma);


    }
}