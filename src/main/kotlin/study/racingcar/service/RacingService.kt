package study.racingcar.service

import study.racingcar.entity.Car
import study.racingcar.repository.CarRepository

class RacingService(private val carRepository: CarRepository) {
    fun intCars(carCount: Int) {
        repeat(carCount) {
            carRepository.saveDefaultCar()
        }
    }

    fun gameStart(gameCount: Int) {
        val cars = carRepository.findAllCars()
        repeat(gameCount) {
            cars.forEach { car -> car.move(getRandomMoveCount(), VALID_CONDITION) }
        }
    }

    fun gameEnd(): List<Car> {
        return carRepository.findAllCars()
    }

    private fun getRandomMoveCount(): Int {
        return (START_INDEX..END_INDEX).random()
    }

    companion object {
        private val START_INDEX = 0
        private val END_INDEX = 9
        private val VALID_CONDITION = 4
    }
}
