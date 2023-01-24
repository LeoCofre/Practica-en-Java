package ProblemasJava.CuarentaiunoAlcincuenta;

import java.util.Scanner;

public class Problema45 {

    public static void main(String[] args) {

        //Dado un número, determinar cuantos dígitos tiene.

        //Variables
        int numero, cantidadDigitos = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        numero = teclado.nextInt();

        //Proceso
        while (numero > 0) {
            numero = numero / 10;
            cantidadDigitos += 1;
        }

        // Salida
        System.out.println("");
        System.out.println("Cant . Digitos : " + cantidadDigitos);
    }
}
