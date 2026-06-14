//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val rollDice = { sides: Int ->
        if (sides == 0) 0 else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    println("rollDice(6): ${rollDice(6)}")
    println("rollDice(12): ${rollDice(12)}")
    println("rollDice(0): ${rollDice(0)}")

    println("rollDice2(6): ${rollDice2(6)}")
    println("rollDice2(12): ${rollDice2(12)}")
    println("rollDice2(0): ${rollDice2(0)}")
}