package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema95 {

    public static void main(String[] args) {

        /*Dada una frase, devuelva la frase en forma encriptada, usando el método de convertir al
    siguiente caracteres del ASCII; ejemplo, si el carácter es A= 65, devolverá 6=66.*/

        //Variables
        String frase, fraseInvertida = "", c;
        int i, p;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        p = 0;
        frase = frase.trim();
        for (i = 0; i < frase.length();
             i++) {
            c = frase.substring(i, i + 1);
            if (!c.equals(" ")) {
                c = String.valueOf((char) (c.codePointAt(0) + 1));
            }
            fraseInvertida += c;
        }

        //Salida
        System.out.println();
        System.out.println("La frase en caracteres es: " + fraseInvertida);
    }
}
