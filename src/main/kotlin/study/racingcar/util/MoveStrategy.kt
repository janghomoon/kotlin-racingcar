package study.racingcar.util

interface MoveStrategy {
    fun isMove(distance: Int, validCondition: Int): Boolean
}

class targetGEvalidConditionMoveStrategy : MoveStrategy {
    override fun isMove(distance: Int, validCondition: Int): Boolean {
        return distance >= validCondition
    }
}

class targetGTvalidConditionMoveStrategy : MoveStrategy {
    override fun isMove(distance: Int, validCondition: Int): Boolean {
        return distance > validCondition
    }
}
