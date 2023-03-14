package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema105 {

    /*Dado una frase devolver la frase sin espacio en blancos. Cree una función para resolver el
    problema.

    FraseSinEspacios( E: Frase: Cadena) :Cadena
    */


    public static void main(String[] args) {

        //Variables
        String frase, fraseSinEspacios;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        frase = teclado.nextLine();

        //Proceso
        fraseSinEspacios = fraseSinEspacios(frase);

        //Salida
        System.out.println("");
        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }

    //Método Frase Sin Espacios
    private static String fraseSinEspacios(String frase) {

        //Variables
        StringBuilder f = new StringBuilder();
        String t;
        int i, p;

        //Proceso
        p = 0;
        frase = frase.trim();
        for (i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                t = frase.substring(p, i);
                p = i + 1;
                f.append(t);
            }
        }
        t = frase.substring(p, i);
        f.append(t);

        //Salida
        return f.toString();
    }
}