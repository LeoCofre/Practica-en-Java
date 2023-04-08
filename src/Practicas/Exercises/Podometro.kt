package Practicas.Exercises

fun main() {
    val steps = 4000
    val caloriesBurned = pedometroStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometroStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}