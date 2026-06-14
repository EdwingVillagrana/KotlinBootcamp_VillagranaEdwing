open class Book(
    val title: String,
    val author: String
) {
    private var currentPage = 0

    open fun readPage() {
        currentPage++
        println("The current page is: $currentPage")
    }
}

class EBook(
    title: String,
    author: String,
    val format: String = "text"
) : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }

    fun getWordCount(): Int {
        return wordCount
    }
}
