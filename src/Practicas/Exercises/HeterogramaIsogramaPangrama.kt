package Practicas.Exercises

import java.util.*

/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */
fun main() {
    esHeterograma("cisterna")
    esIsograma("espacio")
    esPangrama("Un jugoso zumo de piña y kiwi bien frío es exquisito y no lleva alcohol")
}

fun esHeterograma(palabra: String): Boolean {
    val letras = mutableSetOf<Char>()
    for (letra in palabra) {
        if (letra in letras) {
            return false
        }
        letras.add(letra)
    }
    return true
}

fun esIsograma(palabra: String): Boolean {
    val letras = mutableSetOf<Char>()
    for (letra in palabra) {
        if (letra in letras) {
            return false
        }
        letras.add(letra)
    }
    return true
}


fun esPangrama(texto: String): Boolean {
    val letras = mutableSetOf<Char>()
    for (caracter in texto.lowercase(Locale.getDefault())) {
        if (caracter.isLetter()) {
            letras.add(caracter)
        }
    }
    return letras.size == 26
}