package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema38 {

    public static void main(String[] args) {

        //Dado el día, mes y año, determine si es una fecha correcta, considere los años bisiestos.

        //Variables
        int dia, mes, año, diaMaximo = 0;
        String respuesta = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dia: ");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();
        System.out.println("Ingrese año");
        año = teclado.nextInt();

        //Proceso
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMaximo = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaMaximo = 30;
                break;
            case 2:
                if (año % 4 == 0 && (!(año % 100 == 0) || año % 400 == 0))
                    diaMaximo = 29;
                else
                    diaMaximo = 28;
        }
        if ((dia > 0 && dia <= diaMaximo) && (mes > 0 && mes < 13) && año > 0)
            respuesta = " CORRECTO";
        else
            respuesta = " INCORRECTO";
        //Salida
        System.out.println("");
        System.out.println("Respuesta: " + respuesta);
    }
}
