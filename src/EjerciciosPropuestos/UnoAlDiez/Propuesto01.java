package EjerciciosPropuestos.UnoAlDiez;

import java.util.Scanner;

public class Propuesto01 {
    public static void main(String[] args) {

        //Dado dos números enteros (Z), a y b, hallar a + by a- b.

        //Variables
        int primerNumero, segundoNumero, resultadoSuma, resultadoResta;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        primerNumero = teclado.nextInt();
        System.out.println("Ingrese segundo número");
        segundoNumero = teclado.nextInt();

        //Proceso
        resultadoSuma = primerNumero + segundoNumero;
        resultadoResta = primerNumero - segundoNumero;

        //Salida
        System.out.println("El resultado de la  suma de los números es: " + resultadoSuma);
        System.out.println("El resultado de La resta de los números es: " + resultadoResta);

    }
}
