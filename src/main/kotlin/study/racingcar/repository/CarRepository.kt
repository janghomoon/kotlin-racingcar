package study.racingcar.repository

import study.racingcar.entity.Car

class CarRepository {
    private val cars: MutableList<Car> = mutableListOf()

    fun saveDefaultCar() {
        this.cars.add(Car())
    }
    
    fun findAllCars(): List<Car> {
        return this.cars.toList()
    }
}
