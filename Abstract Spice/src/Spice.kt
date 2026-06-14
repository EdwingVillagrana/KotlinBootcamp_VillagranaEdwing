abstract class Spice(
    val name: String,
    val spiciness: String
) {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            "extremely spicy" -> 20
            else -> 0
        }

    abstract fun prepareSpice()
}

interface Grinder {

    fun grind() {
        println("Grinding spice")
    }
}

class Curry(
    spiciness: String
) : Spice("Curry", spiciness), Grinder {

    override fun prepareSpice() {
        grind()
    }
}