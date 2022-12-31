package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema40 {

    public static void main(String[] args) {

        //Convierta a números romanos, números menores a 4000.

        //Variables
        int numero, unidad, decena, centena, mil;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        numero = scanner.nextInt();

        //Proceso
        if (numero <= 3999) {
            unidad = numero % 10;
            numero = numero / 10;
            decena = numero % 10;
            numero = numero / 10;
            centena = numero % 10;
            numero = numero / 10;
            mil = numero % 10;

            switch (mil) {
                case 1:
                    respuesta = "M";
                    break;
                case 2:
                    respuesta = "MM";
                    break;
                case 3:
                    respuesta = "MMM";
                    break;
            }
        }


    }
}
