package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto27 {

    public static void main(String[] args) {

        /*Obtenga el nombre del estado civil según la siguiente tabla.

         Código       Estado civil

            0           Soltero
            1           Casado
            2           Divorciado
            3           Viudo
        */

        //Variables
        char codigo;
        String estadoCivil = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese codigo segun estado civil: ");
        System.out.println("0  Soltero");
        System.out.println("1  Casado");
        System.out.println("2  Divorciado");
        System.out.println("3  Viudo");
        codigo = scanner.next().charAt(0);

        //Proceso
        switch (codigo) {
            case 0:
                estadoCivil = "Soltero";
                break;
            case 1:
                estadoCivil = "Casado";
                break;
            case 2:
                estadoCivil = "Divorciado";
                break;
            case 3:
                estadoCivil = "Viudo";
                break;
        }

        //Salida
        System.out.println();
        System.out.println("El estado civil es " + estadoCivil);
    }
}
