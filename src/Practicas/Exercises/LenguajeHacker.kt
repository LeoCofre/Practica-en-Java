package Practicas.Exercises

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

fun leetTranslator(text: String): String {
    val leet = mapOf(
        "A" to "4",
        "B" to "I3",
        "C" to "[",
        "D" to ")",
        "E" to "3",
        "F" to "|=",
        "G" to "&",
        "H" to "#",
        "I" to "1",
        "J" to ",_|",
        "K" to ">|",
        "L" to "1",
        "M" to "/\\/\\",
        "N" to " ^/",
        "O" to "0",
        "P" to " |*",
        "Q" to "(_,)",
        "R" to "I2",
        "S" to "5",
        "T" to "7",
        "U" to "(_)",
        "V" to "\\/",
        "W" to "\\/\\/",
        "X" to "><",
        "Y" to "j",
        "Z" to "2",
        "1" to "L",
        "2" to "R",
        "3" to "E",
        "4" to "A",
        "5" to "S",
        "6" to "b",
        "7" to "T",
        "8" to "B",
        "9" to "g",
        "0" to "o"
    )

    var leetText = ""

    for (word in text) {
        val upperWord = word.uppercaseChar()
        if (upperWord.toString() in leet.keys) {
            leetText += leet[upperWord.toString()]
        } else {
            leetText += word
        }
    }

    return leetText
}

fun main() {
    println(leetTranslator("Leet"))
    println(leetTranslator("Todo lo que escribamos aqui se va a tranformar a lenguaje hacker"))
    println(leetTranslator(readLine() ?: ""))
}
