package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema92 {

    public static void main(String[] args) {

       /* Según las siguientes especificaciones, genere un código basado en el nombre ingresado.

        Especificaciones para generar el código:

        Primer  carácter del código: Primer carácter del nombre.
        Segundo carácter del código: Tercer carácter del nombre.
        Tercer  carácter del código: Último carácter del nombre.
        Cuarto  carácter del código: Cantidad de caracteres del nombre.*/

        //Variables
        String p, t, u, l, n, c;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre : ");
        n = teclado.nextLine();

        //Proceso
        p = n.substring(0, 1);
        t = n.substring(2, 3);
        u = n.substring(n.length() - 1);
        l = String.valueOf(n.trim().length());
        c = (p + t + u + 1).toUpperCase();

        //Salida
        System.out.println("");
        System.out.println("Codigo : " + c);
    }
}
