package study.racingcar.controller

import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RacingCarControllerTest {

    @ParameterizedTest
    @CsvSource("a, 1", "0, a")
    fun `자동차 수와 라운드 수 문자열 입력 불가 테스트`(input: String, inputTwo:String) {
        //given -valueSourc
        //when
        val racingCarController = RacingCarController(input.toIntOrNull(), inputTwo.toIntOrNull())
        //then
        AssertionsForClassTypes.assertThatThrownBy { racingCarController.start() }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}