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
    private static String fraseSinEspacios(String Frase) {

        //Variables
        StringBuilder f = new StringBuilder();
        String t;
        int i, p;

        //Proceso
        p = 0;
        Frase = Frase.trim();
        for (i = 0; i < Frase.length(); i++) {

            if (Frase.charAt(i) == ' ') {
                t = Frase.substring(p, i);
                p = i + 1;
                f.append(t);
            }
        }
        t = Frase.substring(p, i);
        f.append(t);

        //Salida
        return f.toString();
    }
}