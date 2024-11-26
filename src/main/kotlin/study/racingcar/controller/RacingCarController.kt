package study.racingcar.controller

import study.racingcar.entity.Car
import study.racingcar.service.RacingService
import study.racingcar.view.OutputView

class RacingCarController(
    private val racingService: RacingService,
) {
    fun initCarNames(carNames: Set<String>) {
        racingService.intCars(carNames)
    }

    fun start(): List<Car> = racingService.getGameResultByRound()

    fun getWinners(): List<Car> = racingService.getWinners()
}
