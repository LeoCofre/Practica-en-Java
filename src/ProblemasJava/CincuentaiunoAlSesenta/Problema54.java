package ProblemasJava.CincuentaiunoAlSesenta;

import java.util.Scanner;

public class Problema54 {

    /*Dado un número y su base, determine si el número pertenece a la base ingresada. Recuerde
    que un número pertenece a una base si sus dígitos son menores a su base.*/

    public static void main(String[] args) {

        //Variables
        int num, base, digit, resto;
        boolean pertenece = true;
        String resultado;

        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = sc.nextInt();
        System.out.println("Ingrese la base: ");
        base = sc.nextInt();

        //Proceso
        resto = num;
        while (resto > 0) {
            digit = resto % 10;
            if (digit >= base) {
                pertenece = false;
                break;
            }
            resto = resto / 10;
        }

        if (pertenece) {
            resultado = "Base Correcta";
        } else {
            resultado = "Base Incorrecta";
        }

        //Salida
        System.out.println();
        System.out.println("El resultado es: " + resultado);
    }
}


