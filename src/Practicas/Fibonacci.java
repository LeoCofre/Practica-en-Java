package Practicas;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Secuencia de Fibonacci Con for ");
        fibonacciConFor();
        System.out.println("");
        System.out.println("Secuencia de Fibonacci Con While ");
        fibonacciConWhile();
        System.out.println("");
        System.out.println("Secuencia de Fibonacci Con do-While ");
        fibonacciConDoWhile();

    }

    public static void fibonacciConFor() {
        int a = 0, b = 1, c = 0;

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
    }

    public static void fibonacciConWhile() {
        int a = 0, b = 1, c = 0, i = 0;
        while (i < 10) {
            if (i < 9) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }
    }

    public static void fibonacciConDoWhile() {
        int a = 0, b = 1, c = 0, i = 0;

        do {
            if (i < 9) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        } while (i < 10);
    }
}
