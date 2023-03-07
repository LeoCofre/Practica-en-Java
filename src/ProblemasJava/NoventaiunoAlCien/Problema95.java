package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema95 {

    public static void main(String[] args) {

        /*Dada una frase, devuelva la frase en forma encriptada, usando el método de convertir al
    siguiente caracteres del ASCII; ejemplo, si el carácter es A= 65, devolverá 6=66.*/

        //Variables
        String frase;
        StringBuilder fraseInvertida = new StringBuilder();
        String contador;
        int iterador;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        frase = frase.trim();
        for (iterador = 0; iterador < frase.length(); iterador++) {
            contador = frase.substring(iterador, iterador + 1);
            if (!contador.equals(" ")) {
                contador = String.valueOf((char) (contador.codePointAt(0) + 1));
            }
            fraseInvertida.append(contador);
        }

        //Salida
        System.out.println();
        System.out.println("La frase en caracteres es: " + fraseInvertida);
    }
}
