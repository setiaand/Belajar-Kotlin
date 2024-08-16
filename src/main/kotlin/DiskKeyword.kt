class ThisKeyword(
    private val email: String
) {

    fun senderEmail(email: String) {
        println("Data untuk $email dan ${this.email} dikirim")
    }
}

fun main() {
    val keyword = ThisKeyword(email = "Cahnengrat921@gmail.com")
    keyword.senderEmail(email = "dwi@gmail.com")
}