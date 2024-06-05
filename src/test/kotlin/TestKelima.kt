import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKelima {

    @Test
    fun `test integer decimal literal non empty`() = run {
        val integer = LatihanKelima.integerDecimalLiteral(90)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(90)
    }

    @Test
    fun `test integer hex literal non empty`() = run {
        val integer = LatihanKelima.integerHexLiteral(0x7B)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(0x7B)
    }

    @Test
    fun `test integer binary literal non empty`() = run {
        val integer = LatihanKelima.integerBinaryLiteral(0b0001)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(0b0001)
    }

    @Test
    fun `test integer underscore literal non empty`() = run {
        val integer = LatihanKelima.integerUnderscoreLiteral(2_500_000)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(2_500_000)
    }

    @Test
    fun `test float literal non empty`() = run {
        val float = LatihanKelima.floatLiteral(3.14f)
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo(3.14f)
    }

    @Test
    fun `test double literal non empty`() = run {
        val double = LatihanKelima.doubleLiteral(3.14)
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(3.14)
    }

    @Test
    fun `test double scientific literal non empty`() = run {
        val double = LatihanKelima.doubleScientificLiteral(3.14e2)
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(3.14e2)
    }

    @Test
    fun `test char letter literal non empty`() = run {
        val char = LatihanKelima.charLetterLiteral('D')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('D')
    }

    @Test
    fun `test char digital literal non empty`() = run {
        val char = LatihanKelima.charDigitLiteral('2')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('2')
    }

    @Test
    fun `test char special literal non empty`() = run {
        val char = LatihanKelima.charSpecialLiteral('\u1897')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('\u1897')
    }

    @Test
    fun `test string simple literal non empty`() = run {
        val string = LatihanKelima.stringSimpleLiteral("Dwi Prasetya")
        assertThat(string).isNotNull()
        assertThat(string).isEqualTo("Dwi Prasetya")
    }

    @Test
    fun `test string multiline literal non empty`() = run {
        val char = LatihanKelima.stringMultiLineLiteral(
            """
                Nama: Dwi Prasetya
                Hobi: Ngehack
            """.trimIndent()
        )
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo(
            """
                Nama: Dwi Prasetya
                Hobi: Ngehack
            """.trimIndent()
        )
    }

    @Test
    fun `test boolean true literal non empty`() = run {
        val boolean = LatihanKelima.booleanTrueLiteral(true)
        assertThat(boolean).isTrue()
        assertThat(boolean).isEqualTo(true)
    }

    @Test
    fun `test boolean false literal non empty`() = run {
        val boolean = LatihanKelima.booleanFalseLiteral(false)
        assertThat(boolean).isFalse()
        assertThat(boolean).isEqualTo(false)
    }

    @Test
    fun `test nullabel literal non empty`() = run {
        val nullabel = LatihanKelima.nullLiteral(null)
        assertThat(nullabel).isNull()
        assertThat(nullabel).isEqualTo(null)
    }
}