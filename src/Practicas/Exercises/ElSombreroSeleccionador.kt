package Practicas.Exercises

/*
 * Crea un programa que simule el comportamiento del sombrero seleccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */
fun main() {
    val questions = listOf(
        Question(
            "¿Qué cualidad valoras más?",
            listOf("Valentía", "Ambición", "Lealtad", "Inteligencia"),
            listOf("Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw")
        ),
        Question(
            "¿Qué criatura mágica prefieres?",
            listOf("Dragón", "Basilisco", "Hipogrifo", "Elfo doméstico"),
            listOf("Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw")
        ),
        Question(
            "¿Qué lugar te gustaría explorar?",
            listOf(
                "El Bosque Prohibido",
                "La Cámara de los Secretos",
                "El Callejón Diagon",
                "La Biblioteca de Hogwarts"
            ),
            listOf("Slytherin", "Slytherin", "Hufflepuff", "Ravenclaw")
        ),
        Question(
            "¿Qué materia mágica te llama más la atención?",
            listOf("Defensa contra las Artes Oscuras", "Pociones", "Cuidado de Criaturas Mágicas", "Adivinación"),
            listOf("Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw")
        ),
        Question(
            "¿Qué característica crees que te define mejor?",
            listOf("Coraje", "Astucia", "Generosidad", "Intelecto"),
            listOf("Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw")
        )
    )

    val userAnswers = mutableListOf<Int>()
    for (i in questions.indices) {
        println(questions[i].questionText)
        for (j in questions[i].answerOptions.indices) {
            println("${j + 1}. ${questions[i].answerOptions[j]}")
        }
        print("Seleccione una opción (1-4): ")
        val answer = readLine()?.toIntOrNull()
        if (answer == null || answer !in 1..4) {
            println("Respuesta inválida, seleccione una opción válida.")
            break
        }
        userAnswers.add(answer - 1)
    }

    val house = determineHouse(userAnswers)
    println("¡Bienvenido a $house!")
}

data class Question(val questionText: String, val answerOptions: List<String>, val houseOptions: List<String>)

fun determineHouse(answers: List<Int>) {
    val gryffindorPoints = calculatePoints(answers, listOf(0, 0, 2, 0, 2))
    val slytherinPoints = calculatePoints(answers, listOf(0, 2, 0, 2))
}

fun calculatePoints(responses: List<Int>, listOf: List<Int>): String {
    // inicializar la lista de puntos
    val points = mutableListOf(0, 0, 0, 0)

    // asignar puntos según las respuestas del usuario
    for (response in responses) {
        when (response) {
            1 -> {
                points[0] += 1 // Gryffindor
                points[3] += 1 // Ravenclaw
            }
            2 -> {
                points[1] += 1 // Slytherin
                points[2] += 1 // Hufflepuff
            }
            3 -> {
                points[2] += 1 // Hufflepuff
            }
            4 -> {
                points[3] += 1 // Ravenclaw
            }
        }
    }

    // determinar la casa con más puntos
    val maxPoints = points.maxOrNull()
    val selectedHouse = when (maxPoints) {
        points[0] -> "Gryffindor"
        points[1] -> "Slytherin"
        points[2] -> "Hufflepuff"
        points[3] -> "Ravenclaw"
        else -> "" // en caso de empate o si no hay puntos
    }

    return selectedHouse
}
