package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema54 {

    /*Dado un número y su base, determine si el número pertenece a la base ingresada. Recuerde
    que un número pertenece a una base si sus dígitos son menores a su base.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();

        System.out.println("Ingrese la base: ");
        int base = sc.nextInt();

        boolean pertenece = true;
        int resto = num;
        while (resto > 0) {
            int digit = resto % 10;
            if (digit >= base) {
                pertenece = false;
                break;
            }
            resto = resto / 10;
        }

        if (pertenece) {
            System.out.println("El número " + num + " pertenece a la base " + base);
        } else {
            System.out.println("El número " + num + " no pertenece a la base " + base);
        }
    }
}


