package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema98 {


    public static void main(String[] args) {

        /*Determinar si un número entero es par o impar. Cree un procedimiento para resolver el
        problema.*/

        //Variables
        int n;
        String r[] = new String[1];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();

        //Proceso
        parImpar(n, r);

        // Salida
        System.out.println("");
        System.out.println(" Resultado : " + r[0]);
    }

    private static void parImpar(int num, String res[]) {

        //Variables
        String r = "";

        //Proceso
        if (num % 2 == 0) {
            r = "PAR";
        } else {
            r = " IMPAR";
        }

        //Salida
        res[0] = r;
    }
}