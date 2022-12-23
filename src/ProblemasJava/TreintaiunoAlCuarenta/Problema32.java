package ProblemasJava.TreintaiunoAlCuarenta;

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
        int dia, mes;
        String estacion = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese día: ");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();

        //Proceso
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = " VERANO";
                if (mes == 3 && dia > 20)
                    estacion = "OTOÑO";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "OTOÑO";
                if (mes == 6 && dia > 21)
                    estacion = " INVIERNO";
                break;
            case 7:
            case 8:
            case 9:
                estacion = " INVIERNO";
                if (mes == 9 && dia > 22)
                    estacion = "PRIMAVERA";
                break;
            case 10:
            case 11:
            case 12:
                estacion = " PRIMAVERA";
                if (mes == 12 && dia > 20)
                    estacion = " VERANO";
                break;

        }

        //Salida
        System.out.println("");
        System.out.println("La estación es: " + estacion);
    }
}
