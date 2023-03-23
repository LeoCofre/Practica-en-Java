package Practicas.Exercises

/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Ingrese la longitud de la contraseña (8-16):")
    var longitud = scanner.nextInt()
    while (longitud < 8 || longitud > 16) {
        println("La longitud debe ser entre 8 y 16.")
        println("Ingrese la longitud de la contraseña (8-16):")
        longitud = scanner.nextInt()
    }
    println("Desea incluir mayúsculas en la contraseña? (S/N)")
    val incluirMayus = scanner.next()
    println("Desea incluir números en la contraseña? (S/N)")
    val incluirNumeros = scanner.next()
    println("Desea incluir símbolos especiales en la contraseña? (S/N)")
    val incluirSimbolos = scanner.next()

    val random = Random()
    val letras = "abcdefghijklmnopqrstuvwxyz"
    val letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val numeros = "0123456789"
    val simbolos = "!@#$%^&*()_+-=[]{}|;':,.<>/?`~"
    val caracteres = StringBuilder()
    caracteres.append(letras)
    if (incluirMayus.uppercase(Locale.getDefault()) == "S") {
        caracteres.append(letrasMayus)
    }
    if (incluirNumeros.uppercase(Locale.getDefault()) == "S") {
        caracteres.append(numeros)
    }
    if (incluirSimbolos.uppercase(Locale.getDefault()) == "S") {
        caracteres.append(simbolos)
    }
    val caracteresArray = caracteres.toString().toCharArray()

    val contrasena = StringBuilder()
    for (i in 1..longitud) {
        contrasena.append(caracteresArray[random.nextInt(caracteresArray.size)])
    }
    println("La contraseña generada es: $contrasena")

}