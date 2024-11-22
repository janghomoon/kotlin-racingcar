package study.racingcar.controller

import study.racingcar.entity.Car
import study.racingcar.service.RacingService

class RacingCarController(
    private val racingService: RacingService,
) {
    fun start(
        gameCount: Int,
        carNames: Set<String>,
    ) {
        racingService.intCars(carNames)
        racingService.gameStart(gameCount)
    }

    fun getWinners(): List<Car> = racingService.getWinners()
}
