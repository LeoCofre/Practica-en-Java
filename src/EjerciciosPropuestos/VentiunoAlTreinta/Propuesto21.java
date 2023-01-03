package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto21 {

    public static void main(String[] args) {

        //Dado el número de un mes, devolver el mes en letras.

        //Variables
        int numeroMes;
        String mesEnLetras = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número de mes: ");
        numeroMes = scanner.nextInt();

        //Proceso
        switch (numeroMes) {
            case 1:
                mesEnLetras = "Enero";
                break;
            case 2:
                mesEnLetras = "Febrero";
                break;
            case 3:
                mesEnLetras = "Marzo";
                break;
            case 4:
                mesEnLetras = "Abril";
                break;
            case 5:
                mesEnLetras = "Mayo";
                break;
            case 6:
                mesEnLetras = "Junio";
                break;
            case 7:
                mesEnLetras = "Julio";
                break;
            case 8:
                mesEnLetras = "Agosto";
                break;
            case 9:
                mesEnLetras = "Septiembre";
                break;
            case 10:
                mesEnLetras = "Octubre";
                break;
            case 11:
                mesEnLetras = "Noviembre";
                break;
            case 12:
                mesEnLetras = "Diciembre";
                break;
        }
        //Salida
        System.out.println();
        System.out.println("El mes ingresado es: " + mesEnLetras);

    }
}
