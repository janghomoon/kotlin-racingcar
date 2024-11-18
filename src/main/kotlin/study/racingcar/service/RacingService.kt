package study.racingcar.service

class RacingService(val carCount: Int, val raceCount: Int) {
    fun getRandomMoveCount(): Int {
        val randDomMoveCount = (0..9).random()
        return if (randDomMoveCount > 4) 1 else 0
    }
}