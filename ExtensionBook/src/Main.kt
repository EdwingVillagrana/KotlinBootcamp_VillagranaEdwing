//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val book = Book(
        title = "The Hobbit",
        author = "J.R.R. Tolkien",
        year = 1937,
        pages = 100
    )

    val puppy = Puppy()

    println("Book weight: ${book.weight()} grams")

    while (book.pages > 0) {

        puppy.playWithBook(book)

        println("Pages left: ${book.pages}")
    }

    println("The puppy destroyed the book!")
}