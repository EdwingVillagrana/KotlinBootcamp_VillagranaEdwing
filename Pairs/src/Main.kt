//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val book = Book(
        "The Hobbit",
        "J.R.R. Tolkien",
        1937
    )

    val (title, author) = book.getTitleAuthor()

    val (title2, author2, year) = book.getTitleAuthorYear()

    println("Title: $title")
    println("Author: $author")

    println("Here is your book $title2 written by $author2 in $year.")
}