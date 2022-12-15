package ProblemassJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema32 {

    public static void main(String[] args) {

        //Al ingresar el día y el número de un mes, devolver la estación del año de acuerdo a la siguiente tabla.

        /*Estación                              Tiempo
         Verano                  Del 21 de diciembre al 20 de marzo
         Otoño                   Del 21 de marzo al 21 de junio
         Invierno                Del 22 de junio al 22 de septiembre
         Primavera               Del 23 de septiembre al 20 de diciembre*/

        //Variables
        int d, m;
        String e = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese día: ");
        d = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        m = teclado.nextInt();

        //Proceso
        switch (m) {
            case 1:
            case 2:
            case 3:
                e = " VERANO";
                if (m == 3 && d > 20)
                    e = "OTOÑO";
                break;
            case 4:
            case 5:
            case 6:
                e = "OTOÑO";
                if (m == 6 && d > 21)
                    e = " INVIERNO";
                break;
            case 7:
            case 8:
            case 9:
                e = " INVIERNO";
                if (m == 9 && d > 22)
                    e = "PRIMAVERA";
                break;
            case 10:
            case 11:
            case 12:
                e = " PRIMAVERA";
                if (m == 12 && d > 20)
                    e = " VERANO";
                break;

        }
    }
}
