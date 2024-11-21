package study.racingcar.view

object InputView {
    fun getCarCount(): Int {
        println("자동차 대수는 몇 대인가요?")
        val carCount: Int? = readln().toIntOrNull()
        return inputValid(carCount)
    }

    fun getGameRoundCount(): Int {
        print("시도할 횟수는 몇 회인가요?")
        val gameCount: Int? = readln().toIntOrNull()
        return inputValid(gameCount)
    }

    private fun inputValid(inputCount: Int?): Int {
        if (inputCount == null) {
            throw IllegalArgumentException("숫자를 입력해주세요.")
        }
        require(inputCount.toInt() > 0) { throw IllegalArgumentException("1 이상의 값을 입력해주세요.") }
        return inputCount
    }
}
