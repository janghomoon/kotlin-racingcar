package study.racingcar

import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
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
}