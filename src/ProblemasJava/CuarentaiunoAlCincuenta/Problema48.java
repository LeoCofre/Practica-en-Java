package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema48 {

    public static void main(String[] args) {

        /*Dados dos números, diga si son amigos. Recuerde que dos números son amigos si la suma de
        los divisores de uno de ellos es igual al otro y viceversa; por ejemplo, 220 y 284 son amigos:

        Divisores de 220 son: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 220
        Divisores de 284 son: 1 + 2 + 4 + 71 + 142 = 284*/

        //Variables
        int iterador, primerNumero, segundoNumero, sumaPrimerNumero = 0, sumaSegundoNumero = 0;
        String respuesta = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero 1 : ");
        primerNumero = teclado.nextInt();
        System.out.print(" Numero 2 :");
        segundoNumero = teclado.nextInt();

        //Proceso
        iterador = 1;
        while (iterador <= primerNumero / 2) {
            if (primerNumero % iterador == 0) {
                sumaPrimerNumero += iterador;
            }
            iterador++;
        }

        iterador = 1;
        while (iterador <= segundoNumero / 2) {
            if (segundoNumero % iterador == 0) {
                sumaSegundoNumero += iterador;
            }
            iterador++;
        }
        if (primerNumero == sumaSegundoNumero && segundoNumero == sumaPrimerNumero)
            respuesta = "SON AMIGOS ";
        else
            respuesta = "NO SON AMIGOS ";

        // Salida
        System.out.println("");
        System.out.println("Resultado: " + respuesta);
    }
}
