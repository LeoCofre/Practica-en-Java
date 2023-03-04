package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema94 {

    public static void main(String[] args) {

        //Dado una frase devolver la frase sin espacio en blancos.


        //Variables
        String f1, f2 = "", t;
        int i, p;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase : ");
        f1 = teclado.nextLine();

        //Proceso
        p = 0;
        f1 = f1.trim();
        for (i = 0; i < f1.length(); i++) {


            if (f1.substring(i, i + 1).equals(" ")) {
                t = f1.substring(p, i);
                p = i + 1;
                f2 = f2 + t;
                t = f1.substring(p, i);
                f2 = f2 + t;
            }

            //Salida
            System.out.println();
            System.out.println("Frase sin espacios: " + f2);
        }
    }
}