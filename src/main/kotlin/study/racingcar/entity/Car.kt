package study.racingcar.entity

class Car(private val carName: String, private var moveCount: Int = 0) {
    val currentPosition: Int
        get() = moveCount
    val name: String
        get() = carName

    fun move(
        distance: Int,
        validCondition: Int,
    ) {
        if (distance >= validCondition) moveCount++
    }
}
