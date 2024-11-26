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
}
