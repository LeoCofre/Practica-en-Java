package EjerciciosPropuestos.VentiunoAlTreinta;

import java.util.Scanner;

public class Propuesto24 {

    public static void main(String[] args) {

        //Dado el número de un canal de televisión, determine cual es el nombre del canal.

        //Variables
        int numeroCanal;
        String canalEnletras = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número de canal: ");
        numeroCanal = scanner.nextInt();

        //Proceso
        switch (numeroCanal){
            case 4:
                canalEnletras = "La Red";
                break;
            case 5:
                canalEnletras = "UCV Televisión";
                break;
            case 7:
                canalEnletras ="TVN";
                break;
            case 9:
                canalEnletras = "Megavisión";
                break;
            case 11:
                canalEnletras = "Chilevisión";
                break;
            case 13:
                canalEnletras = "Canal 13";
                break;
        }

    }
}
