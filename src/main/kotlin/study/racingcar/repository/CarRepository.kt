package study.racingcar.repository

import study.racingcar.entity.Car

class CarRepository {
    private val cars: MutableList<Car> = mutableListOf()

    fun saveAllCars(cars: List<Car>) {
        this.cars.addAll(cars)
    }

    fun findAllCars(): List<Car> {
        return this.cars.toList()
    }

    fun findWinnerCars(): List<Car> {
        if (cars.isEmpty()) return emptyList()
        val maxDistance = cars.maxOfOrNull { car -> car.currentPosition } ?: return emptyList()
        return this.cars.filter { car -> car.currentPosition == maxDistance }.toList()
    }
}
