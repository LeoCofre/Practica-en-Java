package ProblemasJava.CientounoAlCientocinco;

import java.util.Scanner;

public class Problema105 {

    /*Dado una frase devolver la frase sin espacio en blancos. Cree una función para resolver el
    problema.

    FraseSinEspacios( E: Frase: Cadena) :Cadena
    */


    public static void main(String[] args) {

        //Variables
        String fl, f2;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        fl = teclado.nextLine();

        //Proceso
        f2 = FraseSinEspacios(fl);

        //Salida
        System.out.println("");
        System.out.println("Frase sin espacios: " + f2);
    }

    //Método Frase Sin Espacios
    private static String FraseSinEspacios(String Frase) {

        //Variables
        String f = "", t;
        int i, p;

        //Proceso
        p = 0;
        Frase = Frase.trim();
        for (i = 0; i < Frase.length(); i++) {

            if (Frase.charAt(i) == ' ') {
                t = Frase.substring(p, i);
                p = i + 1;
                f = f + t;
            }
        }
        t = Frase.substring(p, i);
        f = f + t;

        //Salida
        return f;
    }
}