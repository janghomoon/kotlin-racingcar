package study.racingcar.entity

class Car(carName: String, moveCount: Int = 0) {
    var currentPosition: Int = moveCount
    val name: String = carName

    fun move(
        distance: Int,
        validCondition: Int,
    ) {
        if (distance >= validCondition) { currentPosition ++ }
    }
}
