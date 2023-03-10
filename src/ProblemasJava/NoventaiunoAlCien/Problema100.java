package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema100 {

    public static void main(String[] args) {

        /*Crear un algoritmo para hallar el factorial de un número, el factorial es el producto de todos
        los números consecutivos desde la unidad hasta el número; por ejemplo, factorial de 3! (se denota !) es 1
        X 2 X 3 = 6. Cree una función para resolver el problema.*/

        //Variables
        int n, f, i;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero : ");
        n = teclado.nextInt();

        //Proceso
        f = Factorial(n);

        // Salida
        System.out.println("");
        System.out.println("Factoria l : " + f);
    }

    private static int Factorial(int num) {

        //Variables
        int i, f;

        //Proceso
        f = 1;
        for (i = 1; i <= num; i++)
            f *= i;

        //Salida
        return f;
    }
}