package study.racingcar.service

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import study.racingcar.entity.Car
import study.racingcar.repository.CarRepository
import java.util.stream.Collectors

class RacingServiceTest {
    private val carRepository = CarRepository()

    @BeforeEach
    fun setUp() { // 자동차 객체
        listOf(
            Car("문", 4),
            Car("장", 4),
            Car("호", 1),
        )
        carRepository.saveAllCars(
            listOf(
                Car("문", 4),
                Car("장", 4),
                Car("호", 1),
            ),
        )
    }

    @Test
    fun `가장 멀리간 자동차는 우승할 수 있다 또한 중복 될 수 있다`() {
        // given
        val cars = carRepository.findWinnerCars()
        // when
        val winnerCarName = cars.stream().map { car -> car.name }.collect(Collectors.joining(","))
        // then
        winnerCarName shouldBe "문,장"
    }
}
