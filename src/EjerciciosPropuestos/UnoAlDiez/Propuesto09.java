package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Propuesto09 {

    public static void main(String[] args) {

        //Hallar el área y el perímetro de un rectángulo.

        //Variables
        int ladoUno, ladoDos, area, perimetro;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor de lado 1: ");
        ladoUno = teclado.nextInt();
        System.out.println("Ingrese valos de lado 2");
        ladoDos = teclado.nextInt();

        //Proceso
        area = ladoUno * ladoDos;
        perimetro = 2 * (ladoUno + ladoDos);

        //Salida
        System.out.println("El area para los lados " + ladoUno + " y " + ladoDos + " es " + area + " y el perimetro es "
                + perimetro);

    }
}