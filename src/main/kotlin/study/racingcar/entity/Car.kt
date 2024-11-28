package study.racingcar.entity

import study.racingcar.util.MoveStrategy
import study.racingcar.util.targetGEvalidConditionMoveStrategy

class Car(carName: String, moveCount: Int = 0) {
    var currentPosition: Int = moveCount
    val name: String = carName
    var moveStrategy: MoveStrategy = targetGEvalidConditionMoveStrategy()

    fun setMoveStrategy(moveStrategy: MoveStrategy) {
        this.moveStrategy = moveStrategy
    }

    fun move(
        distance: Int,
        validCondition: Int,
    ) {
        if (moveStrategy.isMove(distance, validCondition)) {
            currentPosition++
        }
    }

    fun clone(): Car {
        return Car(name, currentPosition)
    }
}
