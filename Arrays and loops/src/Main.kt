//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(11, 12, 13, 14, 15)

    val strings = mutableListOf<String>()

    for (number in numbers) {
        strings.add(number.toString())
    }

    println(strings)
}