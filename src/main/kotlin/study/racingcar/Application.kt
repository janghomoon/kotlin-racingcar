package study.racingcar

import study.racingcar.configuration.RacingConfiguration
import study.racingcar.controller.RacingCarController
import study.racingcar.view.InputView
import study.racingcar.view.OutputView


private val racingCarController: RacingCarController = RacingConfiguration().racingCarController()

fun main() {
    val carCount: Int = InputView.getCarCount()
    val gameCount: Int = InputView.getGameRoundCount()
    racingCarController.start(carCount, gameCount)
    val cars = racingCarController.end()
    OutputView.printResult(cars)
}

