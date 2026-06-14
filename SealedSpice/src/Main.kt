//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val curry = Curry("spicy")

    println("Name: ${curry.name}")
    println("Spiciness: ${curry.spiciness}")
    println("Heat: ${curry.heat}")
    println("Color: ${curry.color}")
    println("RGB: ${curry.color.rgb}")

    curry.prepareSpice()

    val spiceContainer = SpiceContainer(curry)

    println("Container label: ${spiceContainer.label}")
}