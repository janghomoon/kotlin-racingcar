package study.racingcar.view

import study.racingcar.entity.Car
import java.util.stream.Collectors

object OutputView {
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
        val result = DASHBAR_SYMBOL.repeat(car.currentPosition)
        car.name
        println("${car.name} : $result")
    }

    private fun printCarDistance(car: Car) {
        val result = DASHBAR_SYMBOL.repeat(car.currentPosition)
        println(result)
    }

    fun printWinners(cars: List<Car>) {
        val winnerCarName = cars.stream().map { car -> car.name }.collect(Collectors.joining(COMMA))
        println("${winnerCarName}가 최종 우승했습니다.")
    }
}
