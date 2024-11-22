package study.racingcar.view

import study.racingcar.entity.Car

object OutputView {
    private const val DASHBAR_SYMBOL = "-"

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
}
