import spices.SimpleSpice
import spices.Spice
import spices.makeSalt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val spice = SimpleSpice()

    println("Name: ${spice.name}")
    println("Heat: ${spice.heat}")

    val spiceCabinet = listOf(
        Spice("Curry", "mild"),
        Spice("Pepper", "medium"),
        Spice("Cayenne", "spicy"),
        Spice("Chili", "very spicy"),
        makeSalt()
    )

    val spicySpices = spiceCabinet.filter { it.heat <= 10 }

    spicySpices.forEach {
        println("${it.name} - ${it.heat}")
    }
}