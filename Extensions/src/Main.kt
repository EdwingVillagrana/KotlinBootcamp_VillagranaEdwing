//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf(
        1, 2, 3, 4, 5,
        6, 7, 8, 9, 0
    )

    println(
        numbers.divisibleBy { it % 3 }
    )
}

fun List<Int>.divisibleBy(
    operation: (Int) -> Int
): List<Int> {

    val result = mutableListOf<Int>()

    for (number in this) {
        if (operation(number) == 0) {
            result.add(number)
        }
    }

    return result
}