package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema52 {

    public static void main(String[] args) {

        /*Determine si un número es capicúa o no. Se dice que un número capicúa es aquel que al
        invertir sus cifras da el mismo número; por ejemplo, 12321 invertido es 12321. Entonces es un número
        capicúa . */

        //Variables
        int numero, numeroInvertido = 0, d, t;
        String respuesta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero:");
        numero = teclado.nextInt();

        //Proceso
        t = numero;
        while (t > 0) {
            d = t % 10;
            t = t / 10;
            numeroInvertido = numeroInvertido * 10 + d;
        }

        if (numero == numeroInvertido)
            respuesta = "ES CAPICUA";
        else
            respuesta = "NO ES CAPICUA";

        //Salida
        System.out.println();
        System.out.println("Resultado: " + respuesta);
    }
}
