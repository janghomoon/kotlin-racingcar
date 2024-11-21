package study.racingcar.entity

import io.kotest.matchers.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CarTest {
    @ParameterizedTest
    @CsvSource("4, 1", "3, 0")
    fun `이동 입력 및 이동값 출력값 반환 테스트`(
        input: Int,
        output: Int,
    ) {
        // given
        val car = Car()
        // when
        car.move(input, 4)
        // then
        car.currentPosition shouldBe output
    }
}
