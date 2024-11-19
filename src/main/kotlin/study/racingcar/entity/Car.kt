package study.racingcar.entity

class Car(private var moveCount: Int = 0) {
    val currentPosition: Int
        get() = moveCount

    fun move(distance: Int) {
        if (distance > 3) moveCount ++
    }

    fun getResult(symbol:String): String {
        return symbol.repeat(moveCount)
    }
}