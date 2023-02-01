package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema49 {

    public static void main(String[] args) {

        //Dado un número, devuelva el inverso del número.

        //Variables
        int devolver, numero, inverso = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        numero = teclado.nextInt();

        //Proceso
        while (numero > 0) {
            devolver = numero % 10;
            numero = numero / 10;
            inverso = inverso * 10 + devolver;
        }

        //Salida
        System.out.println("");
        System.out.println("Numero Inverso : " + inverso);
    }
}
