package Practicas.Exercises

/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */
fun main() {
    esHeterograma("letra")
    esIsograma("espacio")
    esPangrama()
}

fun esHeterograma(palabra: String): Boolean {

// Creamos un set vacío para almacenar las letras de la palabra
    val letras = mutableSetOf<Char>()

    // Recorremos la palabra letra por letra
    for (letra in palabra) {
        // Si la letra ya está en el set, no es un heterograma
        if (letra in letras) {
            return false
        }

        // Agregamos la letra al set
        letras.add(letra)
    }

    // Si llegamos hasta aquí, es un heterograma
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


fun esPangrama() {

}