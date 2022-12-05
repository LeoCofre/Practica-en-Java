package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Propuesto18 {

    public static void main(String[] args) {

        /*Dados dos números enteros «a» y «b», determinar cuál es mayor con respecto al otro.
        a es mayor que b
        b es mayor que a
        a es igual a b*/

        //Variables
        int primerNumero, segundoNumero;
        String salida = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.println("Primer número");
        primerNumero = teclado.nextInt();
        System.out.println("Segundo número");
        segundoNumero = teclado.nextInt();

        //Proceso
        if (primerNumero > segundoNumero) {
            salida = "Primer número es mayor que el segundo";
        } else {
            if (primerNumero < segundoNumero) {
                salida = "Segundo número es mayor que el primero";
            }
        }
        if (primerNumero == segundoNumero) {
            salida = "Primer número es igual al segundo";
        }

        //Salida
        System.out.println("");
        System.out.println(salida);
    }
}
