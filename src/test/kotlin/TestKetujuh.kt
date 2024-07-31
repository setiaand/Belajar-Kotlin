import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class TestKetujuh {

    @Test
    fun `test display character` () = run {
        val char = Character.displayCharacter('A')

        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('A')
    }

    @Test
    fun `test display escape sequence`() = run {
        val char = Character.displayEscapeSequence(
            newLineChar = '\n',
            tabChar = '\t',
            backslashChar = '\\'
        )

        assertThat(char).isNotNull()
    }

    @Test
    fun `test display manipulation char`() = run {
        val char = Character.displayManipulationChar(
            charLower = 'a',
            charUpper = 'A'
        )

        assertThat(char).isNotNull()
    }

    @Test
    fun `display type checker`() = run {
        val  char = Character.displayTypeChecker(
            charDigit = '3',
            charLetter = 'A',
            charWhitespace = ' '
        )

        assertThat(char).isNotNull()
    }
}