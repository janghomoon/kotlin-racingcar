package study.racingcar.entity

import study.racingcar.util.CarUtil.isMove

class Car(carName: String, moveCount: Int = 0) {
    var currentPosition: Int = moveCount
    val name: String = carName

    fun move(
        distance: Int,
        validCondition: Int,
    ) {
        if (isMove(distance, validCondition)) {
            currentPosition++
        }
    }

    fun clone(): Car {
        return Car(name, currentPosition)
    }
}
