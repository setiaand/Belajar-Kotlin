import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKeenam {


    @Test
    fun `test string to int`() = run {
        val str = Convertions.stringToInt("123")
        assertThat(str).isNotNull()
        assertThat(str).isEqualTo(123)
    }

    @Test
    fun `test string to int exception`() = run {
        val str = Convertions.stringToInt("1.23")
        assertThat(str).isNull()
    }

    @Test
    fun `test string to double`() = run {
        val double = Convertions.stringToInt("1.23")
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(1.23)
    }

    @Test
    fun `test string to double exception`() = run {
        val double = Convertions.stringToInt("123L")
        assertThat(double).isNull()
    }

    @Test
    fun `test int to double`() = run {
        val int = Convertions.intToDouble(123)
        assertThat(int).isNotNull()
        assertThat(int).isEqualTo(123.0)
    }

    @Test
    fun `test double to string`() = run {
        val double = Convertions.doubleToString(123.0)
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo("123.0")
    }

    @Test
    fun `test string to float`() = run {
        val float = Convertions.stringToFloat("1.23")
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo(1.23)
    }

    @Test
    fun `test string to float exception`() = run {
        val float = Convertions.stringToFloat("123L")
        assertThat(float).isNull()
    }

    @Test
    fun `test float to string`() = run {
        val float = Convertions.floatToString(1.23F)
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo("1.23")
    }

    @Test
    fun `test string to long`() = run {
        val string = Convertions.stringToLong("123")
        assertThat(string).isNotNull()
        assertThat(string).isEqualTo(123)
    }

    @Test
    fun `test string to long exception`() = run {
        val string = Convertions.stringToLong("1.23")
        assertThat(string).isNull()
    }

    @Test
    fun `test long to string`() = run {
        val long = Convertions.longToString(123L)
        assertThat(long).isNotNull()
        assertThat(long).isEqualTo("123")
    }
}