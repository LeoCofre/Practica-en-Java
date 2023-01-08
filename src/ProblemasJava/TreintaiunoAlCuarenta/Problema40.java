package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema40 {

    public static void main(String[] args) {

        //Convierta a números romanos, números menores a 4000.

        //Variables
        int numero, unidad, decena, centena, mil;
        String romano = "";

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
                    romano = "M";
                    break;
                case 2:
                    romano = "MM";
                    break;
                case 3:
                    romano = "MMM";
                    break;
            }
            switch (centena) {
                case 1:
                    romano = romano + "C";
                    break;
                case 2:
                    romano = romano + "CC";
                    break;
                case 3:
                    romano = romano + "CCC";
                    break;
                case 4:
                    romano = romano + "CD";
                    break;
                case 5:
                    romano = romano + "D";
                    break;
                case 6:
                    romano = romano + "DC";
                    break;
                case 7:
                    romano = romano + "DCC";
                    break;
                case 8:
                    romano = romano + "DCCC";
                    break;
                case 9:
                    romano = romano + "CM";
                    break;
            }
            switch (decena) {
                case 1:
                    romano = romano + "X";
                    break;
                case 2:
                    romano = romano + "XX";
                    break;
                case 3:
                    romano = romano + "XXX";
                    break;
                case 4:
                    romano = romano + "XL";
                    break;
                case 5:
                    romano = romano + "L";
                    break;
                case 6:
                    romano = romano + "LX";
                    break;
                case 7:
                    romano = romano + "LXX";
                    break;
                case 8:
                    romano = romano + "LXXX";
                    break;
                case 9:
                    romano = romano + "XC";
                    break;
            }
            switch (unidad) {
                case 1:
                    romano = romano + "I";
                    break;
                case 2:
                    romano = romano + "II";
                    break;
                case 3:
                    romano = romano + "III";
                    break;
                case 4:
                    romano = romano + "IV";
                    break;
                case 5:
                    romano = romano + "V";
                    break;
                case 6:
                    romano = romano + "VI";
                    break;
                case 7:
                    romano = romano + "VII";
                    break;
                case 8:
                    romano = romano + "VIII";
                    break;
                case 9:
                    romano = romano + "IX";
                    break;
            }
        }
        //Salida
        System.out.println("");
        System.out.println("Romano: " + romano);

    }
}
