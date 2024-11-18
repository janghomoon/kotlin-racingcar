package study.racingcar.entity

class Car(var moveCount: Int = 0) {
    fun move(distance: Int) {
        moveCount += distance
    }

    fun getResult(): String {
        return "-".repeat(moveCount)
    }
}