package study.racingcar

import study.racingcar.configuration.RacingConfiguration
import study.racingcar.controller.RacingCarController
import study.racingcar.view.InputView
import study.racingcar.view.OutputView

private val racingCarController: RacingCarController = RacingConfiguration().racingCarController()

fun main() {
    val carNames: Set<String> = InputView.getCarNames()
    val gameCount: Int = InputView.getGameRoundCount()
    racingCarController.start(gameCount, carNames)
    val cars = racingCarController.getWinners()
    OutputView.printWinners(cars)
}
