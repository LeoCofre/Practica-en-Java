package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema68 {

    public static void main(String[] args) {

        //Determine si un número es primo. Se dice que un número es primo si es divisible entre 1 y entre sí mismo.

        //Variables
        int numero, iterador;
        boolean flag;
        String respuesta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = teclado.nextInt();

        //Proceso
        flag = true;
        for (iterador = 2; iterador <= numero / 2; iterador++) {
            if (numero % iterador == 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            respuesta = "ES PRIMO";
        else
            respuesta = " NO ES PRIMO";

        //Salida
        System.out.println();
        System.out.println("Respuesta : " + respuesta);

    }
}
