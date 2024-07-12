class contohsoal {

    /**
     * Menggunakan unary plus operator.
     *
     * @param value nilai yang akan digunakan dengan unary plus operator.
     * @return nilai yang sama seperti input (tidak ada perubahan).
     */
    fun unaryPlus(value: Int): Int {
        return +value
    }

    /**
     * Menggunakan unary minus operator.
     *
     * @param value nilai yang akan digunakan dengan unary minus operator.
     * @return nilai negatif dari input.
     */
    fun unaryMinus(value: Int): Int {
        return -value
    }

    /**
     * Menggunakan logical NOT operator.
     *
     * @param value nilai boolean yang akan digunakan dengan logical NOT operator.
     * @return negasi dari nilai boolean input.
     */
    fun logicalNot(value: Boolean): Boolean {
        return !value
    }

    /**
     * Menggunakan increment operator (prefix dan postfix).
     *
     * @param value nilai yang akan di-increment.
     * @return nilai setelah di-increment (prefix dan postfix).
     */
    fun increment(value: Int): Pair<Int, Int> {
        var prefixIncrement = value
        var postfixIncrement = value
        return Pair(++prefixIncrement, postfixIncrement++)
    }

    /**
     * Menggunakan decrement operator (prefix dan postfix).
     *
     * @param value nilai yang akan di-decrement.
     * @return nilai setelah di-decrement (prefix dan postfix).
     */
    fun decrement(value: Int): Pair<Int, Int> {
        var prefixDecrement = value
        var postfixDecrement = value
        return Pair(--prefixDecrement, postfixDecrement--)
    }
}

fun main() {
    val demo = contohsoal()

    val (prefixDecrement, postfixDecrement) = demo.decrement(7)
    println("Decrement Prefix (--7): $prefixDecrement")
    println("Decrement Postfix (7--): $postfixDecrement")

}