package study.racingcar.util

object Move {
    private val START_INDEX = 0
    private val END_INDEX = 9

    fun getRandomMoveCount(): Int {
        return (START_INDEX..END_INDEX).random()
    }

    fun isMove(
        distance: Int,
        validCondition: Int,
    ): Boolean {
        return distance >= validCondition
    }
}
