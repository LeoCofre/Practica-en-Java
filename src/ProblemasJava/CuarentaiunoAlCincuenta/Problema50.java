package ProblemasJava.CuarentaiunoAlCincuenta;

import java.util.Scanner;

public class Problema50 {

    public static void main(String[] args) {

        /*Crear un algoritmo que indique si un número es cubo perfecto (anstrong) o no, se dice que
        un número es cubo perfecto si al sumar los cubos de sus dígitos dan el mismo número, por ejemplo
        153, cubos de sus dígitos 13 + 53 + 33 = 153 el número 153 es cubo perfecto.*/

        //Variables
        int t, digitos, suma = 0, numero;
        String resultado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        numero = teclado.nextInt();

        //Proceso
        t = numero;
        while (t > 0) {
            digitos = t % 10;
            t /= 10;
            suma = (int) (suma + Math.pow(digitos, 3.0));
        }
        if (numero == suma)
            resultado = "CUBO PERFECTO";
        else
            resultado = "NO ES CUBO PERFECTO";

        // Salida
        System.out.println();
        System.out.println("Resultado: " + resultado);
    }
}
