package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema48 {

    public static void main(String[] args) {

        /*Dados dos números, diga si son amigos. Recuerde que dos números son amigos si la suma de
        los divisores de uno de ellos es igual al otro y viceversa; por ejemplo, 220 y 284 son amigos:

        Divisores de 220 son: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 220
        Divisores de 284 son: 1 + 2 + 4 + 71 + 142 = 284*/

        //Variables
        int i, n1, n2, s1 = 0, s2 = 0;
        String r = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero 1 : ");
        n1 = teclado.nextInt();
        System.out.print(" Numero 2 :");
        n2 = teclado.nextInt();

        //Proceso
        i = 1;
        while (i <= n1 / 2) {
            if (n1 % i == 0) {
                s1 += i;
            }
            i++;
        }

        i = 1;

        while (i <= n2 / 2) {
            if (n2 % i == 0) {
                s2 += i;
            }
            i++;
        }
        if (n1 == s2 && n2 == s1)
            r = "SON AMIGOS ";
        else
            r = "NO SON AMIGOS ";

        // Salida
        System.out.println("");
        System.out.println("Resultado: " + r);
    }
}
