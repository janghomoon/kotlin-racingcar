package study.racingcar.util

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CarUtilTest {
    @RepeatedTest(10)
    fun `0-9의 숫자만  받을 수 있다`() {
        val randomValue = CarUtil.getRandomMoveCount()
        (randomValue in 0..9) shouldBe true
    }

    @ParameterizedTest
    @CsvSource("4, true", "3, false")
    fun `4보다 큰 경우 만 true를 반환 한다`(input: Int, expected: Boolean) {
        val isMove = CarUtil.isMove(input, 4)
        isMove shouldBe expected
    }
}
