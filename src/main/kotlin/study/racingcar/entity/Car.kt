package study.racingcar.entity

class Car(private var moveCount: Int = 0) {
    val currentPosition: Int
        get() = moveCount

    fun move(
        distance: Int,
        validCondition: Int,
    ) {
        if (distance >= validCondition) moveCount++
    }
}
