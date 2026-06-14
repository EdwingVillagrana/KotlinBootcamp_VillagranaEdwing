//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val curry = Curry("spicy")

    println(curry.name)
    println(curry.spiciness)
    println(curry.heat)

    curry.prepareSpice()
}