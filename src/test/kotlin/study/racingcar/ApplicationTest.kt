package study.racingcar

import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import study.racingcar.service.RacingService
import java.io.ByteArrayInputStream

class ApplicationTest {


    @ParameterizedTest
    @CsvSource("a, 숫자를 입력해주세요.", "0, 1 이상의 값을 입력해주세요.")
    fun `자동차 수와 라운드 수 문자열 입력 불가 테스트`(input: String, resultMessage:String) {
        //given -valueSource
        //when
        val inputString = input
        val inputStream = ByteArrayInputStream(inputString.toByteArray())
        System.setIn(inputStream)
        //then
        AssertionsForClassTypes.assertThatThrownBy { Application().main() }
            .isInstanceOf(IllegalArgumentException::class.java).hasMessage(resultMessage)
    }


    @RepeatedTest(10)
    fun `게임의 랜덤 함수로 이동 카운트 반환 테스트`() {
        //given - random repeat
        //when
        val result = RacingService(3, 3).getRandomMoveCount()
        //then
        assertTrue(result == 0 || result == 1)
    }
}