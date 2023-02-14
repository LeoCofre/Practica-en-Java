    package EjerciciosPropuestos.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Propuesto33 {

    public static void main(String[] args) {

        //Calcular la suma y el producto de los N primeros números naturales múltiplos de 3.

        //Variables
        int numero, suma = 0, producto = 1, contador = 0, iterador = 3;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número:");
        numero = scanner.nextInt();

        //Proceso
        while (contador < numero) {
            if (iterador % 3 == 0) {
                suma += iterador;
                producto *= iterador;
                contador++;
            }
            iterador++;
        }

        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
    }
}

