package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema52 {

    public static void main(String[] args) {

        /*Determine si un número es capicúa o no. Se dice que un número capicúa es aquel que al
        invertir sus cifras da el mismo número; por ejemplo, 12321 invertido es 12321. Entonces es un número
        capicúa . */

        //Variables
        int numero, invertido = 0, ultimoDigito, original;
        String respuesta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero:");
        numero = teclado.nextInt();

        //Proceso
        original = numero;
        while (original > 0) {
            ultimoDigito = original % 10;
            original = original / 10;
            invertido = invertido * 10 + ultimoDigito;
        }

        if (numero == invertido)
            respuesta = "ES CAPICUA";
        else
            respuesta = "NO ES CAPICUA";

        //Salida
        System.out.println();
        System.out.println("Resultado: " + respuesta);
    }
}
