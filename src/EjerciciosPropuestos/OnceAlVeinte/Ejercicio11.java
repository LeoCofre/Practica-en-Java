package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        /*Dada la edad de una persona, determinar si es mayor o menor de edad. Considere que se
        considera a alguien como mayor de edad si tiene 18 años o más.*/

        //Variables
        int edad;
        String respuesta = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        edad = scanner.nextInt();

        //Proceso
        if (edad >= 18){
            respuesta = "Eres mayor de edad";
        }else{
            respuesta = "Eres menor de edad";
        }

        //Salida
        System.out.println(respuesta);


    }
}
