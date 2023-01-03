package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto22 {

    public static void main(String[] args) {

        // Lea un número del 1 al 7 y devuelva el día de la semana, considere que 1 es domingo.

        //Variables
        int numero;
        String diaSemana = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero del 1 al 7: ");
        numero = scanner.nextInt();

        //Proceso
        switch (numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Lunes";
                break;
            case 3:
                diaSemana = "Martes";
                break;
            case 4:
                diaSemana = "Miercoles";
                break;
            case 5:
                diaSemana = "Jueves";
                break;
            case 6:
                diaSemana = "Viernes";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
        }

        System.out.println();
        System.out.println("El número ingresado corresponde al día: " + diaSemana);
    }
}
