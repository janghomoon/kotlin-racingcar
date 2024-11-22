package study.racingcar.view

object InputView {
    fun getCarCount(): Int {
        println("자동차 대수는 몇 대인가요?")
        val carCount: Int? = readln().toIntOrNull()
        return inputNumberValid(carCount)
    }


    fun getCarNames(carCount:Int): Set<String> {
        print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val carNames: String = readln()
        return inputCarNameValid(carCount, carNames)
    }

    fun getGameRoundCount(): Int {
        print("시도할 횟수는 몇 회인가요?")
        val gameCount: Int? = readln().toIntOrNull()
        return inputNumberValid(gameCount)
    }

    private fun inputCarNameValid(carCount: Int, carNames: String?): Set<String> {
        if (carNames.isNullOrEmpty()) {
            throw IllegalArgumentException("경주할 자동차를 입력해주세요")
        }
        val carNameList: List<String> = carNames.split(",")
        require(carCount == carNameList.size) { throw IllegalArgumentException("경주할 자동차 수는 입력한 차량 대수와 같아야합니다.") }
        carNameList.forEach { carName -> carNameSizeValid(carName) }
        val carSet = carNameList.toSet()
        require(carCount == carSet.size) { "자동차 이름은 중복 될 수 없습니다." }
        return carSet
    }
    private fun carNameSizeValid(carName: String) {
        if (carName.length > 5) { throw IllegalArgumentException("자동차 이름은 5글자를 초과할수 없습니다.") }
    }
    private fun inputNumberValid(inputCount: Int?): Int {
        if (inputCount == null) {
            throw IllegalArgumentException("숫자를 입력해주세요.")
        }
        require(inputCount.toInt() > 0) { throw IllegalArgumentException("1 이상의 값을 입력해주세요.") }
        return inputCount
    }
}
