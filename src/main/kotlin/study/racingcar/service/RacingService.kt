package study.racingcar.service

import study.racingcar.entity.Car
import study.racingcar.repository.CarRepository
import study.racingcar.view.OutputView
import java.util.stream.Collectors

class RacingService(private val carRepository: CarRepository) {

    fun intCars(carNames: Set<String>) {
        val cars = carNames.stream()
            .map { carName -> Car(carName) }
            .collect(Collectors.toList())
        carRepository.saveAllCars(cars)
    }

    fun gameStart(gameCount: Int) {
        val cars = carRepository.findAllCars()
        repeat(gameCount) {
            moveCars(cars)
            OutputView.printRoundResult(cars)
        }
    }
    private fun moveCars(cars: List<Car>) {
        cars.forEach { car -> car.move(getRandomMoveCount(), VALID_CONDITION) }
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
