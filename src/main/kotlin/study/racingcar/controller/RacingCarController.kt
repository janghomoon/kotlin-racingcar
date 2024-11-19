package study.racingcar.controller

import study.racingcar.service.RacingService

class RacingCarController {

    fun start(carCount: Int?, gameCount: Int?) {
       val race = RacingService(inputValid(carCount), inputValid(gameCount))
        race.start()
        race.printResult()
    }

    private fun inputValid(inputCount: Int?): Int {
        if (inputCount == null) {
            throw IllegalArgumentException("숫자를 입력해주세요.")
        }
        require(inputCount.toInt() > 0) { throw IllegalArgumentException("1 이상의 값을 입력해주세요.") }
        return inputCount
    }
}
