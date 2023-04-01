package practicas.exercises

/*
 * crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - el resultado puede ser: "player 1", "player 2", "tie" (empate)
 * - la función recibe un listado que contiene pares, representando cada jugada.
 * - el par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - ejemplo. entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. resultado: "player 2".
 * - debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */
fun main() {
    val moves = listOf(
        Pair("🗿", "✂️"),
        Pair("✂️", "🗿"),
        Pair("📄", "✂️")
    ) // Aquí puedes modificar la lista de jugadas

    val player1Score = moves.count { it.first == "🗿" && (it.second == "✂️" || it.second == "🦎")
            || it.first == "📄" && (it.second == "🗿" || it.second == "🖖")
            || it.first == "✂️" && (it.second == "📄" || it.second == "🦎")
            || it.first == "🦎" && (it.second == "📄" || it.second == "🖖")
            || it.first == "🖖" && (it.second == "🗿" || it.second == "✂️")
    }
    val player2Score = moves.size - player1Score

    when {
        player1Score > player2Score -> println("Player 1")
        player2Score > player1Score -> println("Player 2")
        else -> println("Tie")
    }
}
