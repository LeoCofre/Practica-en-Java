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
            switch (centena) {
                case 1:
                    respuesta = "C";
                    break;
                case 2:
                    respuesta = "CC";
                    break;
                case 3:
                    respuesta = "CCC";
                    break;
                case 4:
                    respuesta = "CD";
                    break;
                case 5:
                    respuesta = "D";
                    break;
                case 6:
                    respuesta = "DC";
                    break;
                case 7:
                    respuesta = "DCC";
                    break;
                case 8:
                    respuesta = "DCCC";
                    break;
                case 9:
                    respuesta = "CM";
                    break;
            }
            switch (decena) {
                case 1:
                    respuesta = "X";
                    break;
                case 2:
                    respuesta = "XX";
                    break;
                case 3:
                    respuesta = "XXX";
                    break;
                case 4:
                    respuesta = "XL";
                    break;
                case 5:
                    respuesta = "L";
                    break;
                case 6:
                    respuesta = "LX";
                    break;
                case 7:
                    respuesta = "LXX";
                    break;
                case 8:
                    respuesta = "LXXX";
                    break;
                case 9:
                    respuesta = "XC";
                    break;
            }
            switch (unidad){
                case 1:
                    respuesta = "I";
                    break;
                case 2:
                    respuesta = "II";
                    break;
                case 3:
                    respuesta = "III";
                    break;
                case 4:
                    respuesta = "IV";
                    break;
                case 5:
                    respuesta = "V";
                    break;
                case 6:
                    respuesta = "VI";
                    break;
                case 7:
                    respuesta = "VII";
                    break;
                case 8:
                    respuesta = "VIII";
                    break;
                case 9:
                    respuesta = "IX";
                    break;
            }
        }


    }
}
