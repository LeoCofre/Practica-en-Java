public class Main {
    public static class DuplicateCharacters {
        public static void main(String[] args) {

            String string1 = "aAbCTc1bB1ytq00";
            string1 = string1.toLowerCase();

            int count;

            char[] string = string1.toCharArray();

            System.out.println("Las letras y numeros duplicados son:");

            for (int i = 0; i < string.length; i++) {

                count = 1;
                for (int j = i + 1; j < string.length; j++) {
                    if (string[i] == string[j] && string[i] != ' ') {
                        count++;

                        string[j] = '0';

                    }

                }
                if (count > 1 && string[i] != '0')
                    System.out.println(string[i]);

            }

        }
    }
}
