package study

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EmptySource
import org.junit.jupiter.params.provider.NullSource

class StringCalculatorTest {
    @DisplayName("입력 값 테스트 NULL  혹은 빈문자열인경우")
    @ParameterizedTest
    @NullSource
    @EmptySource
    fun calculatorInputTest(input: String?) {
        AssertionsForClassTypes.assertThatThrownBy { StringCalculator().calculator(input) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("입력 값 문자열이 사칙연산 기호가 아닌경우")
    @Test
    fun calculateSymbolErrorTest() {
        AssertionsForClassTypes.assertThatThrownBy { StringCalculator().calculator("1 @ 2") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("덧셈 테스트")
    @Test
    fun addTest() {
        val input = "1 + 1"

        val result = StringCalculator().calculator(input)

        assertThat(result).isEqualTo(2)
    }

    @DisplayName("곱셉 테스트")
    @Test
    fun multiplicationTest() {
        val input = "2 * 2"

        val result = StringCalculator().calculator(input)

        assertThat(result).isEqualTo(4)
    }

    @DisplayName("곱셉 테스트")
    @Test
    fun divisionTest() {
        val input = "2 / 2"

        val result = StringCalculator().calculator(input)

        assertThat(result).isEqualTo(1)
    }

    @DisplayName("뺄셈 테스트")
    @Test
    fun subtractionTest() {
        val input = "2 / 2"

        val result = StringCalculator().calculator(input)

        assertThat(result).isEqualTo(1)
    }

    @DisplayName("복합 연산 테스트")
    @Test
    fun complexTest() {
        val input = "2 + 3 * 4 / 2"

        val result = StringCalculator().calculator(input)

        assertThat(result).isEqualTo(10)
    }
}
