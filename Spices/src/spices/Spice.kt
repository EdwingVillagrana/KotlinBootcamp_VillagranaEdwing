package spices

class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            "extremely spicy" -> 20
            else -> 0
        }

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt")
