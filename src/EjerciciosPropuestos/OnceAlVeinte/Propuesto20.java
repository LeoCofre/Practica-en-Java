package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Propuesto20 {

    public static void main(String[] args) {

        /*Dadas tres longitudes, si forman un triángulo, devolver el tipo de triángulo según sus lados.
        T. Equilátero: Sus tres lados son iguales
        T. Isósceles: Tiene dos lados iguales.
        T. Escaleno: Sus tres lados son diferentes.*/

        //Variables
        int a, b, c;
        String mensaje = "";

        //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese lado a: ");
        a = teclado.nextInt();
        System.out.print("Ingrese lado b: ");
        b = teclado.nextInt();
        System.out.print("Ingrese lado c: ");
        c = teclado.nextInt();

        //proceso
        if (a == b && b == c && c == a) {
            mensaje = "EQUILATERO";
        } else {
            if (a == b && c != a && c != b || b == c && a != c && a != b || c == a && b != a && b != c) {
                mensaje = "ISOSCELES";
            } else {
                if (a != b && b != c && c != a) {
                    mensaje = "ESCALENO";
                }
            }
        }

        //SALIDA
        System.out.println("");
        System.out.println("Resultado: " + mensaje);

    }
}

