class Fizzbuzz {

    fun main() {

        for (index in 1..100) {
            val divisibleByThree = index % 3 == 0
            val divisibleByFive = index % 5 == 0
            if (divisibleByThree && divisibleByFive) {
                println("fizzbuzz")
            } else if (divisibleByThree) {
                println("fizz")
            } else if (divisibleByFive) {
                println("buzz")
            } else {
                println(index)
            }
        }
    }
}

fun main() {
        println(isAnagram("amor", "roma"))
    }

    private fun isAnagram(wordOne: String, wordTwo: String): Boolean {
        if (wordOne.lowercase() == wordTwo.lowercase()) {
            return false
        }
        return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
    }

