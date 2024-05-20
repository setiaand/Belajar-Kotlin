fun main(){
    /* *
     * Penggunaan val (Read-Only Variabel)
     *
     * val digunakan untuk mendeklarasikan variabel yang nilainya tidak bisa diubah
     * setelah dideklarasikan. Variabel ini mirip dengan final di Java.
     *
     * @author Dwi Prasetya
     * */

    val name = "Dwi" //Variabel yang hanya dapat dibaca bertipe String
    println(name) //Output: Dwi

     // name = "Duwai" // ini akan menyebabkan error saat kompilasi

    val age = 25 // Variabel yang hanya dapat dibaca bertipe Int
    println(age) //Output: 25

    // age = 26 // Ini akan menyebabkan error saat kompilasi

}