//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val book = Book(
        "Hamlet",
        "William Shakespeare",
        1603
    )

    println(book.canBorrow(3)) // true
    println(book.canBorrow(5)) // false

    book.printUrl()
}