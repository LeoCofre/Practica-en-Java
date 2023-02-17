package ProblemasJava.SesentaiunoAlSetenta;

import java.util.Scanner;

public class Problema63 {

    public static void main(String[] args) {

        /*Dado dos números, diga si son amigos o no. Recuerde que dos números son amigos si la
        suma de los divisores de uno de ellos es igual al otro y viceversa; por ejemplo, 220 y 284 son amigos:
        Divisores de 220 son: 1 + 2 + 4 +S + 10 + 11 + 20 + 22 + 44 +55+ 110 = 220
        Divisores de 284 son: 1 + 2 + 4 + 71 + 142 = 284
        */

        //Variables
        int iterador, numeroUno, numeroDos, sumaUno = 0, sumaDos = 0;
        String resultado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        numeroUno = teclado.nextInt();
        System.out.print("Numero 2: ");
        numeroDos = teclado.nextInt();

        //Proceso
        for (iterador = 1; iterador <= numeroUno / 2; iterador++) {
            if (numeroUno % iterador == 0)
                sumaUno += iterador;
        }
        for (iterador = 1; iterador <= numeroDos / 2; iterador++) {
            if (numeroDos % iterador == 0)
                sumaDos += iterador;
        }
        if (numeroUno == sumaDos && numeroDos == sumaUno)
            resultado = "SON AMIGOS ";
        else
            resultado = "NO SON AMIGOS ";

        //Salida
        System.out.println();
        System.out.println("Resultado : " + resultado);

    }
}
