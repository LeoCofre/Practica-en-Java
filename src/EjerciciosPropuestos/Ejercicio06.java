package EjerciciosPropuestos;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        //Hallar el área y el perímetro de un cuadrado.

        //Constantes
        final int PERIMETRO;
        final double AREA;

        //Variables
        int lado;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero de un lado: ");
        lado = teclado.nextInt();

        //Proceso
        PERIMETRO = lado * 4;
        AREA = Math.pow(lado, 2);

        //Salida
        System.out.println("El perimetro del cuadrado con un lado de " + lado + " es: " + PERIMETRO + "y el area es: " + AREA);


    }
}
