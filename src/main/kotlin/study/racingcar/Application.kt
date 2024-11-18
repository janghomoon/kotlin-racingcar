package study.racingcar

class Application {
    fun main() {
        println("자동차 대수는 몇 대인가요?")
        var carCount:Int? = readln().toIntOrNull()
        inputValid(carCount)
        print("시도할 횟수는 몇 회인가요?")
        val moveCount:Int? = readln().toIntOrNull()
        inputValid(moveCount)
    }

    private fun inputValid(inputCount:Int?) {
        if (inputCount == null) throw IllegalArgumentException("숫자를 입력해주세요.")
        require(inputCount.toInt() > 0) { throw IllegalArgumentException("1 이상의 값을 입력해주세요.") }
    }
}
