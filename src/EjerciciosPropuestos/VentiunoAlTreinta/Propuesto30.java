package EjerciciosPropuestos.VentiunoAlTreinta;

import java.time.YearMonth;
import java.util.Scanner;

public class Propuesto30 {

    public static void main(String[] args) {

        //Dada una fecha determine cuántos días faltan para que acabe el año.

        //Variables
        int diaActual, mesActual, diasRestantes = 0;
        YearMonth ahora = null;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dia:");
        diaActual = scanner.nextInt();
        System.out.println("Ingrese mes:");
        mesActual = scanner.nextInt();

        //Proceso
        if (mesActual == 12) {
            // Diciembre
            diasRestantes = 31 - diaActual;
        } else if (mesActual == 11) {
            // Noviembre
            diasRestantes = 31 - diaActual + 30;
        } else if (mesActual == 10) {
            // Octubre
            diasRestantes = 31 - diaActual + 30 + 31;
        } else if (mesActual == 9) {
            // Septiembre
            diasRestantes = 31 - diaActual + 30 + 31 + 30;
        } else if (mesActual == 8) {
            // Agosto
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31;
        } else if (mesActual == 7) {
            // Julio
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31;
        } else if (mesActual == 6) {
            // Junio
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (mesActual == 5) {
            // Mayo
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (mesActual == 4) {
            // Abril
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        } else if (mesActual == 3) {
            // Marzo
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
        } else if (mesActual == 2) {
            // Febrero
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + (ahora.isLeapYear() ? 29 : 28);
        } else if (mesActual == 1) {
            // Enero
            diasRestantes = 31 - diaActual + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + (ahora.isLeapYear() ? 29 : 28) + 31;
        }
        System.out.println("Días restantes en el año: " + diasRestantes);
    }


}

