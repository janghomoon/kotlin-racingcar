package study.racingcar.view

import study.racingcar.entity.Car
import java.util.logging.Logger
import java.util.stream.Collectors

object OutputView {
    private val logger = Logger.getLogger("OutputView")
    private const val DASHBAR_SYMBOL = "-"
    private const val COMMA = ","

    fun printResult(cars: List<Car>) {
        cars.forEach { car ->
            printCarDistance(car)
        }
    }

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car ->
            printCarNameAndDistance(car)
        }
    }

    private fun printCarNameAndDistance(car: Car) {
        val result = List(car.currentPosition) { DASHBAR_SYMBOL }.joinToString("")
        logger.info { "${car.name} : $result" }
    }

    private fun printCarDistance(car: Car) {
        val result = List(car.currentPosition) { DASHBAR_SYMBOL }.joinToString("")
        logger.info { result }
    }

    fun printWinners(cars: List<Car>) {
        val winnerCarName = cars.stream().map { car -> car.name }.collect(Collectors.joining(COMMA))
        logger.info { "${winnerCarName}가 최종 우승했습니다." }
    }
}
