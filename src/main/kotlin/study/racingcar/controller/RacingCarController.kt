package study.racingcar.controller

import study.racingcar.entity.Car
import study.racingcar.service.RacingService
import study.racingcar.view.OutputView

class RacingCarController(
    private val racingService: RacingService,
) {
    fun start(
        gameCount: Int,
        carNames: Set<String>,
    ) {
        racingService.intCars(carNames)
        repeat(gameCount) {
            val cars = racingService.getGameResultByRound()
            OutputView.printRoundResult(cars)

        }
    }

    fun getWinners(): List<Car> = racingService.getWinners()
}
