package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        /*Dados los siguientes datos de entrada: saldo anterior, tipo de movimiento «R» (retiro) o «D»
        (deposito) y monto de la transacción, obtener como dato de salida el saldo actual.*/

        //Variables
        int montoAnterior, montoTransaccion, saldoActual = 0;
        char tipoMovimiento;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Saldo");
        montoAnterior = teclado.nextInt();
        System.out.print("Ingrese el Tipo de Movimiento");
        tipoMovimiento = teclado.next().charAt(0);
        System.out.print("IngreseMonto");
        tipoMovimiento = teclado.next().charAt(0);

        //Proceso
        if (tipoMovimiento == 'R') {
            saldoActual = montoAnterior - tipoMovimiento;
        } else {
            if (tipoMovimiento == 'D') {
                saldoActual = montoAnterior + tipoMovimiento;
            }
        }
        //Salida
        System.out.println("");
        System.out.print("Es: " + saldoActual);
    }

}


