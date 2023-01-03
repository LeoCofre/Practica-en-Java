package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto23 {

    public static void main(String[] args) {

        //Dados los siguientes operadores aritméticos(+,-,* y/), devuelva el nombre del operador.

        //Variables
        char operador;
        String nombreOperador = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese uno de los siguientes operadores: +,-,* ,/");
        operador = scanner.next().charAt(0);

        //Proceso
        switch (operador) {
            case '+':
                nombreOperador = "Suma";
                break;
            case '-':
                nombreOperador = "Resta";
                break;
            case '*':
                nombreOperador = "Multiplicación";
                break;
            case '/':
                nombreOperador = "División";
                break;
        }
        //Salida
        System.out.println();
        System.out.println("El operador ingresado corresponde a una " + nombreOperador);
    }
}
