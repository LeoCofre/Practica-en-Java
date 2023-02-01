package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema50 {

    public static void main(String[] args) {

        /*Crear un algoritmo que indique si un número es cubo perfecto (anstrong) o no, se dice que
        un número es cubo perfecto si al sumar los cubos de sus dígitos dan el mismo número, por ejemplo 153,
                cubos de sus dígitos 13 + 53 + 33 = 153 el número 153 es cubo perfecto.*/

        //Variables
        int t, d, s = 0, n;
        String r;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();

        //Proceso
        t = n;
        while (t > 0) {
            d = t % 10;
            t /= 10;
            s = (int) (s + Math.pow(d, 3.0));
        }
        if (n == s)
            r = " CUBO PERFECTO";
        else
            r = " NO ES CUBO PERFECTO";

        // Salida
        System.out.println();
        System.out.println("Resultado: " + r);
    }
}
