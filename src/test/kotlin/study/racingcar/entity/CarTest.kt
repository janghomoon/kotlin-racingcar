package study.racingcar.entity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CarTest {

    @ParameterizedTest
    @CsvSource("1, -", "2, --")
    fun `이동 입력 및 이동값 출력값 반환 테스트`(input:Int, output:String?) {
        //given
        val car = Car(0)
        //when
        car.move(input)
        //then
        assertThat(car.getResult()).isEqualTo(output)

    }
}
