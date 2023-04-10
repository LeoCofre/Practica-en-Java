package Practicas.Exercises

/*
 * Crea un generador de números pseudoaleatorios entre 0 y 100.
 * - No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
 *
 * Es más complicado de lo que parece...
 */

fun main() {
    (0..100).forEach { _ -> println(random()) }
}

private fun random(): Int {
    return (System.nanoTime() % 101).toInt()
}