package Practicas.Exercises

/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */


import kotlin.math.sqrt

fun checkPrimeFibonacciEven(number: Int) {

    var result = "$number "

    // Primo
    if (number > 1) {
        var isPrime = true
        for (index in 2 until number) {
            if (number % index == 0) {
                result += "no es primo, "
                isPrime = false
                break
            }
        }
        if (isPrime) {
            result += "es primo, "
        }
    } else {
        result += "no es primo, "
    }

    // Fibonacci
    result += if (number > 0 && (isPerfectSquare(5 * number * number + 4) || isPerfectSquare(
            5 * number * number - 4
        ))
    ) {
        "es fibonacci "
    } else
        "no es fibonacci "

    // Par
    result += if (number % 2 == 0) {
        "y es par"
    } else "y es impar"

    println(result)
}

fun isPerfectSquare(number: Int): Boolean {
    val sqrt = sqrt(number.toDouble()).toInt()
    return sqrt * sqrt == number
}

fun main() {
    checkPrimeFibonacciEven(2)
    checkPrimeFibonacciEven(7)
    checkPrimeFibonacciEven(0)
    checkPrimeFibonacciEven(1)
    checkPrimeFibonacciEven(-2)
}


