class FunctionOverride {


    fun senderEmail(email: String, address: String) {
        println("Email $email")
        println("address $address")
    }

    fun senderEmail(email: String, address: String, job: String) {
        println("Email: $email")
        println("Address: $address")
        println("Job: $job")
    }

}

fun main() {
    val override = FunctionOverride()

    override.senderEmail(email = "cahnengrat921@gmail.com", address = "Medan")
    override.senderEmail(email = "cahnengrat921@gmail.com", address = "Medan", job = "Mobile Developer")
}