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

}
