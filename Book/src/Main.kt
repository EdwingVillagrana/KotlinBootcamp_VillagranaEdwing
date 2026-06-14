//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val book = Book("The Hobbit", "J.R.R. Tolkien")
    book.readPage()

    val ebook = EBook("Kotlin for Beginners", "JetBrains")
    ebook.readPage()
    ebook.readPage()

    println("Words read: ${ebook.getWordCount()}")
}