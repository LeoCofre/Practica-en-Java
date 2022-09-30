package Practicas;

public class ListarElementosArray {
    public static void main(String[] args) {
        String paises[] = {"Chile", "Perú", "Colombia", "Venezuela", "Argentina", "Ecuador"};

        for (int i = 0; i < paises.length; i++) {
            System.out.println("ELEMENTO N°" + i + " "+ paises[i]);
        }
    }
}
