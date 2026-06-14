const val MAX_NUMBER_BOOKS = 5

class Book(
    val title: String,
    val author: String,
    val year: Int
) {

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_NUMBER_BOOKS
    }

    fun printUrl() {
        println("$BASE_URL$title.html")
    }

    companion object {
        const val BASE_URL = "https://library.org/books/"
    }
}