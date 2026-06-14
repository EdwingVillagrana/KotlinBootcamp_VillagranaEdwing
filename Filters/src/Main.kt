//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val spices = listOf(
        "curry", "pepper", "cayenne",
        "ginger", "red curry", "green curry", "red pepper"
    )

    val curries = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println(curries)

    val spicesCE = spices.filter {
        it.startsWith('c') && it.endsWith('e')
    }

    println(spicesCE)

    val spicesCE2 = spices
        .filter { it.startsWith('c') }
        .filter { it.endsWith('e') }

    println(spicesCE2)

    val firstThree = spices
        .take(3)
        .filter { it.startsWith('c') }

    println(firstThree)


}