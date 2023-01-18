package EjerciciosPropuestos;

import java.util.Scanner;

public class Propuesto29 {

    public static void main(String[] args) {

        /*Según la siguiente tabla, obtener la ciudad que visitará, después de ingresar su sexo y el
        puntaje obtenido en un examen.

                                    _________Sexo___________
            Puntaje                 Masculino       Femenino
       Entre 18 y 35                Arequipa        Cuzco
       Entre 36 y 75                Cuzco           Iquitos
       Mayor a 75                   Iquitos         Arequipa

        */

        //Variables
        int puntaje, sexo;
        String cuidad = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sexo:");
        System.out.println("1.- Masculino");
        System.out.println("2.- Femenino");
        do {
            sexo = scanner.nextInt();
            scanner.nextLine();
            if (sexo <= 0 || sexo > 2) {
                System.out.print("Valor incorrecto, ingreselo nuevamente: ");
            }
        } while (sexo <= 0 || sexo > 2);
        System.out.println("Ingrese puntaje");

        //Proceso
        do {
            puntaje = scanner.nextInt();
            scanner.nextLine();
            if (puntaje < 0 || puntaje > 100) {
                System.out.print("Valor incorrecto, ingreselo nuevamente: ");
            }
        } while (puntaje < 0 || puntaje > 100);
        if (sexo == 1 && puntaje >= 18 && puntaje <= 35) {
            cuidad = "Arequipa";
        }
        if (sexo == 1 && puntaje >= 36 && puntaje <= 75) {
            cuidad = "Cusco";
        }
        if (sexo == 1 && puntaje >= 76) {
            cuidad = "Iquito";
        }
        if (sexo == 2 && puntaje >= 18 && puntaje <= 35) {
            cuidad = "Cusco";
        }
        if (sexo == 2 && puntaje >= 36 && puntaje <= 75) {
            cuidad = "Iquito";
        }
        if (sexo == 2 && puntaje >= 76) {
            cuidad = "Arequipa";
        }

        //Salida
        System.out.println();
        System.out.println("La cuidad que visitará es " + cuidad);

    }

}
