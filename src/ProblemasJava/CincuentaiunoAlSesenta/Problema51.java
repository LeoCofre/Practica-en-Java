package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema51 {

    public static void main(String[] args) {

       /* Obtenga el cociente y el residuo de una división mediante restas sucesivas; por ejemplo, si el
        dividendo es 3989 y el divisor es 1247, entonces:

        3989 - 1247 = 2742 R(l )
        2742 - 1247 = 1495 R(2)
        1495 - 1247 = 248 R(3)

        Ya no se puede seguir restando, pues 248 es menor a 1247, entonces el cociente es el número de veces
        restado (3) y el residuo es el último número obtenido (248).*/

        //Variables
        int numerador, denominador, cociente = 0, resultado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numerador: ");
        numerador = teclado.nextInt();
        System.out.print("Denominador : ");
        denominador = teclado.nextInt();

        //Proceso
        while (numerador >= denominador) {
            numerador -= denominador;
            cociente++;
        }
        resultado = numerador;

        //Salida
        System.out.println();
        System.out.println("Cociente : " + cociente);
    }
}
