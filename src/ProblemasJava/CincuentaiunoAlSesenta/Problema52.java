package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema52 {

    public static void main(String[] args) {

        /*Determine si un número es capicúa o no. Se dice que un número capicúa es aquel que al
        invertir sus cifras da el mismo número; por ejemplo, 12321 invertido es 12321. Entonces es un número
        capicúa . */

        //Variables
        int n, i = 0, d, t;
        String r;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero:");
        n = teclado.nextInt();

        //Proceso
        t = n;
        while (t > 0) {
            d = t % 10;
            t = t / 10;
            i = i * 10 + d;
        }

        if (n == i)
            r = "ES CAPICUA";
        else
            r = "NO ES CAPICUA";

        // Salida
        System.out.println();
        System.out.println("Resultado: " + r);
    }
}
