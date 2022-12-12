package ProblemassJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        //Dado un número entero de un dígito (O al 9), devolver el número en letras.

        //Variables
        int numero;
        String numeroEnLetras = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 0 al 9");
        numero = teclado.nextInt();

        //Proceso
        switch (numero) {
            case 0:
                numeroEnLetras = "CERO";
                break;
            case 1:
                numeroEnLetras = "UNO";
                break;
            case 2:
                numeroEnLetras = "DOS";
                break;
            case 3:
                numeroEnLetras = "TRES";
                break;
            case 4:
                numeroEnLetras = "CUATRO";
                break;
            case 5:
                numeroEnLetras = "CINCO";
                break;
            case 6:
                numeroEnLetras = " SEIS";
                break;
            case 7:
                numeroEnLetras = " SIETE";
                break;
            case 8:
                numeroEnLetras = "OCHO";
                break;
            case 9:
                numeroEnLetras = " NUEVE";
                break;
        }
        System.out.println("");
        System.out.println("El número ingresado es: " + numeroEnLetras);
    }
}
