package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema93 {

    public static void main(String[] args) {

        //Determine cuántas veces se repite una letra en una frase dada.

        //Variables
        String frase, letra;
        int cantidad = 0, iterador;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = scanner.nextLine();
        System.out.println("Ingrese una letra: ");
        letra = scanner.nextLine();

        //Proceso
        for (iterador = 0; iterador <= frase.length() - 1; iterador++) {
            if (frase.toUpperCase().substring(iterador, iterador + 1).equals(letra.toUpperCase()))
                cantidad++;
        }

        //Salida
        System.out.println();
        System.out.println("La cantidad de letras " + letra + " que contiene la frase ingresada es : " +
                cantidad);
    }
}
