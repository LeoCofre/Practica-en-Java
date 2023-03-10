package ProblemasJava.NoventaiunoAlCien;

import java.util.Scanner;

public class Problema99 {

    public static void main(String[] args) {

        /*Dado un número, determinar cuántos dígitos tiene. Cree una función para resolver el
        problema.*/

        //Variables
        int n, e = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero");
        n = teclado.nextInt();

        //Proceso
        e = cantidadDigitos(n);

        //Salida
        System.out.println("");
        System.out.println("Cant . Digitos : " + e);
    }

    //Método Cantidad Digitos
    private static int cantidadDigitos(int num) {

        //Variables
        int c = 0;

        //Proceso
        while (num > 0) {
            num = num / 10;
            c += 1;
        }

        //Salida
        return c;
    }
}