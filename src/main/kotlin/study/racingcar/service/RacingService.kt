package study.racingcar.service

import study.racingcar.entity.Car
import study.racingcar.repository.CarRepository
import java.util.stream.Collectors

class RacingService(private val carRepository: CarRepository) {
    fun intCars(carNames: Set<String>) {
        val cars =
            carNames.stream()
                .map { carName -> Car(carName) }
                .collect(Collectors.toList())
        carRepository.saveAllCars(cars)
    }

    private fun moveCars(cars: List<Car>) {
        cars.forEach { car -> car.move(getRandomMoveCount(), VALID_CONDITION) }
    }

    fun getWinners(): List<Car> {
         val cars = carRepository.findAllCars()
        if (cars.isEmpty()) return emptyList()
        val maxDistance = cars.maxOfOrNull { car -> car.currentPosition } ?: return emptyList()
        return cars.filter { car -> car.currentPosition == maxDistance }.toList()
    }

    private fun getRandomMoveCount(): Int {
        return (START_INDEX..END_INDEX).random()
    }

    fun getGameResultByRound(): List<Car> {
        val cars = carRepository.findAllCars()
        moveCars(cars)
        return cars
    }

    companion object {
        private val START_INDEX = 0
        private val END_INDEX = 9
        private val VALID_CONDITION = 4
    }
}
