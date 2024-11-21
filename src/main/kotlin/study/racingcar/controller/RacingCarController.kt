package study.racingcar.controller

import study.racingcar.entity.Car
import study.racingcar.service.RacingService

class RacingCarController(
    private val racingService: RacingService,
) {
    fun start(
        carCount: Int,
        gaeCount: Int,
    ) {
        racingService.intCars(carCount)
        racingService.gameStart(gaeCount)
    }

    fun end(): List<Car> = racingService.gameEnd()
}
