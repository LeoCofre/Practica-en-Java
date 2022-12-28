package ProblemasJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema38 {

    public static void main(String[] args) {

        //Dado el día, mes y año, determine si es una fecha correcta, considere los años bisiestos.

        //Variables
        int dia, mes, año, diaMaximo;
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
        }


    }
}
