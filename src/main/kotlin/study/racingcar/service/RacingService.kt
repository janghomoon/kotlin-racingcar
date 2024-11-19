package study.racingcar.service


import study.racingcar.entity.Car

class RacingService(carCount: Int, private val gameCount: Int) {
    private val cars = List(carCount) { Car() }

    fun start() {
        repeat(gameCount) {
            cars.forEach { car -> car.move(getRandomMoveCount()) }
        }
    }

    fun printResult() {
        cars.forEach { car ->
            println(car.getResult(PRINT_SYMBOL))
        }
    }

    private fun getRandomMoveCount(): Int {
        return (0..9).random()
    }

    companion object {
        private val PRINT_SYMBOL = "-"
    }
}
