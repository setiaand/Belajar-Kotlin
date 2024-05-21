import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKedua {

    @Test
    fun `test not empty variable name`() = run {
        val name = LatihanKedua.showingDataName("Dwi Prasetya")
        assertThat(name).isNotEmpty()
        assertThat(name).isInstanceOf(String::class.java)
    }

    @Test
    fun `test empty variable name`() = run {
        val name = LatihanKedua.showingDataName()
        assertThat(name).isEmpty()
        assertThat(name).isInstanceOf(String::class.java)
    }

    @Test
    fun `test not empty variable age`() = run {
        val age = LatihanKedua.showingDataAge(27)
        assertThat(age).isNotNull()
    }

    @Test
    fun `test empty variable age`() = run {
        val age = LatihanKedua.showingDataAge()
        assertThat(age).isNotNull()
    }
}