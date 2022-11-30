package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

       /*Crear un programa que al ingresar tres números enteros devuelva los números ordenados en
         forma ascendente y en forma descendente.*/


    }

    //Variables
    int primerNumero, segundoNumero, tercerNumero;
    Scanner entrada = new Scanner(System.in);

    public void ingresarnumeros() {
        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        primerNumero = entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        segundoNumero = entrada.nextInt();
        System.out.print("Ingrese numero 3: ");
        tercerNumero = entrada.nextInt();


    }
}
