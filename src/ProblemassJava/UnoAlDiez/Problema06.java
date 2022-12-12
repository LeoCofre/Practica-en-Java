package ProblemassJava.UnoAlDiez;

import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args) {
        // Dado un número de 5 dígitos, devolver el número en orden inverso.

        //Variables
        int numero,numeroInverso,residuo;

        //Entrada
        Scanner teclado= new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        numero = teclado.nextInt();

        //Proceso
        residuo = numero % 10;
        numero = numero / 10;
        numeroInverso = residuo * 10;
        residuo = numero % 10 ;
        numero = numero / 10;
        numeroInverso = (numeroInverso + residuo) * 10;
        residuo = numero % 10 ;
        numero = numero / 10 ;
        numeroInverso = (numeroInverso + residuo) * 10;
        residuo = numero % 10;
        numero = numero / 10 ;
        numeroInverso = (numeroInverso + residuo) * 10;
        numeroInverso = numeroInverso + numero;

        //Salida
        System.out.println("");
        System.out.println("Inverso: " + numeroInverso) ;
    }
}
