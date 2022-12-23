package ProblemasJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Problema28 {

    public static void main(String[] args) {

       /* Dados dos números enteros y un operador (+, -, • y /), devolver la operación de los dos
        números según el operador ingresado. Considere que si el segundo número es cero y el operador es<</>>,
        no es divisible con el primer número, entonces devolver como resultado <<O>> .*/

        //Variables
        char operador;
        int primerNumero, segundoNumero, resultado = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tipo de operación");
        System.out.println("Suma +");
        System.out.println("Resta -");
        System.out.println("División /");
        System.out.println("Multiplicación *");
        operador = teclado.next().charAt(0);
        System.out.println("Ingrese un número: ");
        primerNumero = teclado.nextInt();
        System.out.println("Ingrese otro número: ");
        segundoNumero = teclado.nextInt();

        //Proceso
        if (operador == '+') {
            resultado = primerNumero + segundoNumero;
        } else if (operador == '-') {
            resultado = primerNumero - segundoNumero;
        } else if (operador == '*') {
            resultado = primerNumero * segundoNumero;
        } else if (operador == '/') {
            if (segundoNumero != 0) {
                resultado = primerNumero / segundoNumero;
            } else
                resultado = 0;
        }

        //Salida
        System.out.println("");
        System.out.println("El resultado es: " + resultado);


    }
}