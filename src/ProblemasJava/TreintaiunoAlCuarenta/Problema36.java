package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema36 {

    public static void main(String[] args) {

        // Una empresa ha establecido diferentes precios para sus productos, según la calidad.

        /*                    Calidad
        Producto        1       2       3
            1         5000    4500    4000
            2         4500    4000    3500
            3         4000    3500    3000*/

        //Variables
        int producto, calidad, precio = 0;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese código de calidad de 1 a 3: ");
        calidad = teclado.nextInt();
        System.out.println("Ingrese código de producto de 1 a 3: ");
        producto = teclado.nextInt();

        //Proceso
        switch (calidad) {
            case 1:
                switch (producto) {
                    case 1:
                        precio = 5000;
                        break;
                    case 2:
                        precio = 4500;
                        break;
                    case 3:
                        precio = 4000;
                        break;
                }
                break;
            case 2:
                switch (producto) {
                    case 1:
                        precio = 4500;
                        break;
                    case 2:
                        precio = 4000;
                        break;
                    case 3:
                        precio = 3500;
                        break;
                }
                break;
            case 3:
                switch (producto) {
                    case 1:
                        precio = 4000;
                        break;
                    case 2:
                        precio = 3500;
                        break;
                    case 3:
                        precio = 3000;
                        break;
                }
        }
        //Salida
        System.out.println("");
        System.out.println("El precio a pagar es : " + precio );
    }

}