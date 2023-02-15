package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema62 {

    public static void main(String[] args) {

       /* Crear el algoritmo que indique si un número es perfecto o no. Se dice que un número es
        perfecto si la suma de sus divisores es igual al número; por ejemplo, 6 tiene como divisores
        1, 2 y 3, entonces 1 + 2 + 3 = 6. El número 6 es perfecto. Si el número es 9 tiene como
        divisores 1, 3, entonces 1 + 3 = 4, por lo tanto no es perfecto.*/

        //Variables
        int numero, iterador, suma = 0;
        String resultado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = teclado.nextInt();

        //Proceso
        for (iterador = 1; iterador <= numero; iterador++) {
            if (numero % iterador == 0)
                suma += iterador;
        }
        if (suma == numero)
            resultado = "Es un número 'Perfecto'";
        else
            resultado = "No es un número 'Perfecto'";

        //Salida
        System.out.println();
        System.out.println(resultado);

    }
}
