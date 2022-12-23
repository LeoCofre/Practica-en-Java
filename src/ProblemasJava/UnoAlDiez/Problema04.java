package ProblemasJava.UnoAlDiez;

import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {

        //Hallar la potencia de numero ingresando base y exponente,(números enteros positivos).

        //Variables
        short base, exponente;
        int potencia;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base : ");
        base = teclado.nextShort();
        System.out.print("Exponente : ");
        exponente = teclado.nextShort();

        //Proceso
        potencia = (int) Math.pow(base, exponente);

        //Salida
        System.out.println("");
        System.out.println("Potencia : " + potencia);

    }
}
