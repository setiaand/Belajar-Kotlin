import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

/**
 * Kelas ini digunakan untuk menguji kelas LatihanPertama.
 *
 * @author: Dwi Prasetya
 */
class TestPertama {
    /**
     * Metode pengujian ini memeriksa apakah fungsi showingPrint dari kelas LatihanPertama
     * berjalan dengan sukses dan mengembalikan hasil yang tidak null serta bertipe Unit.
     *
     * Kasus uji ini memastikan bahwa showingPrint tidak mengembalikan nilai kosong (null)
     * dan memastikan bahwa tipe yang dikembalikan adalah Unit.
     */
    @Test
    fun `showing print success (case not Empty)`() = run {
        val latihanPertama = LatihanPertama()
        val result = latihanPertama.showingPrint
        assertThat(result).isNotNull()
        assertThat(result).isInstanceOf(Unit::class.java)
    }
}