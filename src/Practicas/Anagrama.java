package Practicas;

import org.jetbrains.annotations.NotNull;

public class Anagrama {
    public static void main(String[] args) {
        isAnagram("colo","colo");
    }

    static boolean isAnagram(@NotNull String a, @NotNull String b) {
        // Complete the function
        //test inicial para "no anagramas"
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        //Map donde se guardara cada letra con su frecuencia
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        for (int k = 0; k < b.length(); k++) {
            char letter = b.charAt(k);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }

        //testear cada letra del otro String contra el Map
        //si la palabra no contiene la letra o la frecuencia es 0 devolver false
        //si la letra esta reducir la frecuencia a 1

        for (int k = 0; k < a.length(); k++) {
            char letter = a.charAt(k);

            if (!map.containsKey(letter)) {
                return false;
            }

            Integer frequency = map.get(letter);

            if (frequency == 0) {
                return false;
            } else {
                map.put(letter, --frequency);
            }
        }
        return true;


    }

}





