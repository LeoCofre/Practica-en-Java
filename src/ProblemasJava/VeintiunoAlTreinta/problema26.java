package ProblemasJava.VeintiunoAlTreinta;

import java.util.Scanner;

public class problema26 {

    public static void main(String[] args) {

        /*Al ingresar un número entre 1 y 4 devolver la estación del año de acuerdo a la siguiente tabla.
                Número Estación
        1 Verano
        2 Otoño
        3 Invierno
        4 Primavera*/

        //Variables
        int numero;
        String estacion = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de su estacion favorita");
        System.out.println("1  Verano");
        System.out.println("2  Otoño ");
        System.out.println("3  Invierno ");
        System.out.println("4  Primavera ");
        numero = teclado.nextInt();

        //Proceso
        switch (numero) {
            case 1:
                estacion = "Verano";
                break;
            case 2:
                estacion = "Otoño";
                break;
            case 3:
                estacion = "Invierno";
                break;
            case 4:
                estacion = "Primavera";
                break;
        }

        //Salida
        System.out.println("");
        System.out.println("Estacion favorita elegida es : " + estacion);
    }
}