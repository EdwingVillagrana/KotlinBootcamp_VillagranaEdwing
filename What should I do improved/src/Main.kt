//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("How are you feeling today? ")
    val mood = readLine()!!

    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isSadRainyCold(mood, weather, temperature) -> "Stay in bed"
        isHot(temperature) -> "Go swimming"
        isHappySunny(mood, weather) -> "Go for a walk"
        isTired(mood) -> "Take a nap"
        isEnergetic(mood, weather) -> "Go hiking"
        else -> "Stay home and read."
    }
}

fun isHappySunny(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHot(temperature: Int) =
    temperature > 35

fun isTired(mood: String) =
    mood == "tired"

fun isEnergetic(mood: String, weather: String) =
    mood == "energetic" && weather == "sunny"