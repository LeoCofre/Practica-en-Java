package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

public class Propuesto17 {

    public static void main(String[] args) {

        /*Dados los siguientes datos de entrada: saldo anterior, tipo de movimiento «R» (retiro) o «D»
        (deposito) y monto de la transacción, obtener como dato de salida el saldo actual.*/

        //Variables
        int saldoAnterior, montoTransaccion, saldoActual = 0;
        char tipoMovimiento;

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Saldo");
        saldoAnterior = teclado.nextInt();
        System.out.print("Ingrese el Tipo de Movimiento");
        tipoMovimiento = teclado.next().charAt(0);
        System.out.print("IngreseMonto");
        montoTransaccion = teclado.next().charAt(0);

        //Proceso
        if (tipoMovimiento == 'R') {
            saldoActual = saldoAnterior - montoTransaccion;
        } else {
            if (tipoMovimiento == 'D') {
                saldoActual = saldoAnterior + montoTransaccion;
            }
        }
        //Salida
        System.out.println("");
        System.out.print("El saldo actúal es : " + saldoActual);
    }

}


