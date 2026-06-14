import kotlin.random.Random

class Book(
    val title: String,
    val author: String,
    val year: Int,
    var pages: Int
)

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) {
    pages = (pages - torn).coerceAtLeast(0)
}

class Puppy {

    fun playWithBook(book: Book) {

        val pagesToTear = Random.nextInt(1, 13)

        println("Puppy tore $pagesToTear pages.")

        book.tornPages(pagesToTear)
    }
}