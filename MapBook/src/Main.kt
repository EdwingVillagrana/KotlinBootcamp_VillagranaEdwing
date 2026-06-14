//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val allBooks = setOf(
        "Hamlet",
        "Macbeth",
        "Romeo and Juliet",
        "Othello"
    )

    val library = mapOf(
        "William Shakespeare" to allBooks
    )

    val hasHamlet = library.any {
        it.value.contains("Hamlet")
    }

    println("Does the library have Hamlet? $hasHamlet")

    val moreBooks = mutableMapOf(
        "The Hobbit" to "J.R.R. Tolkien"
    )

    println(moreBooks)

    moreBooks.getOrPut("1984") { "George Orwell" }

    println(moreBooks)

    moreBooks.getOrPut("The Hobbit") { "Someone Else" }

    println(moreBooks)
}