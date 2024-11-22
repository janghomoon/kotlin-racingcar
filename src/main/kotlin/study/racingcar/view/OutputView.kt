package study.racingcar.view

import study.racingcar.entity.Car

object OutputView {
    private const val DASHBAR_SYMBOL = "-"

    fun printResult(cars: List<Car>) {
        cars.forEach { car ->
            printCarDistance(car)
        }
    }

    private fun printCarDistance(car: Car) {
        val result = DASHBAR_SYMBOL.repeat(car.currentPosition)
        println(result)
    }
}
