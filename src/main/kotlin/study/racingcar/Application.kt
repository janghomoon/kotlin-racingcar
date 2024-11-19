package study.racingcar

import study.racingcar.controller.RacingCarController

fun main() {
    println("자동차 대수는 몇 대인가요?")
    val carCount:Int? = readln().toIntOrNull()
    print("시도할 횟수는 몇 회인가요?")
    val gameCount:Int? = readln().toIntOrNull()
    val racingCarController = RacingCarController()
    racingCarController.start(carCount, gameCount)

}
