package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema95 {

    public static void main(String[] args) {

        /*Dada una frase, devuelva la frase en forma encriptada, usando el método de convertir al
    siguiente caracteres del ASCII; ejemplo, si el carácter es A= 65, devolverá 6=66.*/

        //Variables
        String fl, f2 = "", c;
        int i, p;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        fl = teclado.nextLine();

        //Proceso
        p = 0;
        fl = fl.trim();
        for (i = 0; i < fl.length();
             i++) {
            c = fl.substring(i, i + 1);
            if (!c.equals(" ")) {
                c = String.valueOf((char) (c.codePointAt(0) + 1));
            }
            f2 += c;
        }

        //Salida
        System.out.println("");
        System.out.println(" Frase sin espac ios: " + f2);
    }
}
