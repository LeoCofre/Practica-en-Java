package EjerciciosPropuestos.OnceAlVeinte;

import java.util.Scanner;

class Ejercicio15 {

    public static void main(String[] args) {

        /*Crear un programa que al ingresar tres números enteros devuelva los números ordenados en
        forma ascendente y en forma descendente.*/

        //Variables
        int primerNumero, segundoNumero, tercerNumero;
        String ordenAscendente, ordenDesendente;

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        primerNumero = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        segundoNumero = scanner.nextInt();
        System.out.print("Ingrese numero 3: ");
        tercerNumero = scanner.nextInt();

        //Proceso
        if (primerNumero > segundoNumero) {
            if (primerNumero > tercerNumero) {
                if (segundoNumero > tercerNumero) {
                    ordenAscendente = ("Orden Ascendente: " + tercerNumero + " " + segundoNumero + " " + primerNumero);
                    ordenDesendente = ("Orden descendente: " + primerNumero + " " + segundoNumero + " " + tercerNumero);
                } else {
                    ordenAscendente = ("Orden Ascendente: " + primerNumero + " " + tercerNumero + " " + segundoNumero);
                   ordenDesendente = ("Orden descendente: " + segundoNumero + " " + tercerNumero + " " + primerNumero);
                }
            } else {
                ordenAscendente = ("Orden Ascendente: " + segundoNumero + " " + primerNumero + " " + tercerNumero);
                System.out.println("Orden descendente: " + tercerNumero + " " + primerNumero + " " + segundoNumero);
            }
        } else {
            if (segundoNumero > tercerNumero) {
                if (primerNumero > tercerNumero) {
                    ordenAscendente = ("Orden Ascendente: " + tercerNumero + " " + primerNumero + " " + segundoNumero);
                    ordenDesendente = ("Orden descendente: " + segundoNumero + " " + primerNumero + " " + tercerNumero);
                } else {
                    ordenAscendente = ("Orden Ascendente: " + primerNumero + " " + tercerNumero + " " + segundoNumero);
                    ordenDesendente = ("Orden descendente: " + segundoNumero + " " + tercerNumero + " " + primerNumero);
                }
            } else {
                ordenAscendente = ("Orden Ascendente: " + primerNumero + " " + segundoNumero + " " + tercerNumero);
                ordenDesendente = ("Orden descendente: " + tercerNumero + " " + segundoNumero + " " + primerNumero);
            }
        }
    }



        /*Ejercicio15 fc = new Ejercicio15();
        fc.ingresarnumeros();
        fc.ordenar();*/
    /*}

    int a, b, c;

    Scanner entrada = new Scanner(System.in);

    public void ingresarnumeros() {
        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        a = entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        b = entrada.nextInt();
        System.out.print("Ingrese numero 3: ");
        c = entrada.nextInt();
    }

    public void ordenar() {
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
                    System.out.println("Orden descendente: " + a + " " + b + " " + c);
                } else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                } else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }
            } else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }
        }
    }*/
}
