//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("tired"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" -> "Stay home and read."
        mood == "happy" && temperature > 25 -> "Go swimming"
        mood == "tired" -> "Take a nap"
        else -> "Stay home and read."
    }
}