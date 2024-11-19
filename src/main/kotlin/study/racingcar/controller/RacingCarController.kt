package study.racingcar.controller

class RacingCarController(carCount:Int?, gameCount:Int?) {
    val carCount:Int? = carCount
    val gameCount:Int? = gameCount

    fun start() {
        inputValid(carCount)
        inputValid(gameCount)
    }
    fun inputValid(inputCount:Int?) {
        if (inputCount == null) throw IllegalArgumentException("숫자를 입력해주세요.")
        require(inputCount.toInt() > 0)
            throw IllegalArgumentException("1 이상의 값을 입력해주세요.")
    }
}