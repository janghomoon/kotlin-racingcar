package study.racingcar.service

import study.racingcar.entity.Car

class RacingService(val carCount: Int, val raceCount: Int) {

    val cars = List(carCount) { Car() }

    fun start() {
        repeat(raceCount) {
            cars.forEach { e -> e.move(getRandomMoveCount()) }
        }
    }

    fun result() {
        cars.forEach { e ->
            println(e.getResult())
        }
    }
    
    fun getRandomMoveCount(): Int {
        val randDomMoveCount = (0..9).random()
        return if (randDomMoveCount > 4) 1 else 0
    }
}