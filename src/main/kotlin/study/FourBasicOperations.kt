package study

import study.enums.FourBasicOperationSymbols

class FourBasicOperations {
    fun operate(
        beforeValue: Int,
        targetValue: Int,
        symbol: FourBasicOperationSymbols,
    ): Int {
        val result: Int =
            when (symbol) {
                FourBasicOperationSymbols.ADD -> addition(beforeValue, targetValue)
                FourBasicOperationSymbols.SUBTRACT -> subtraction(beforeValue, targetValue)
                FourBasicOperationSymbols.MULTIPLY -> multiplication(beforeValue, targetValue)
                FourBasicOperationSymbols.DIVIDE -> division(beforeValue, targetValue)
            }
        return result
    }

    private fun addition(
        beforeValue: Int,
        targetValue: Int,
    ): Int {
        return beforeValue + targetValue
    }

    private fun subtraction(
        beforeValue: Int,
        targetValue: Int,
    ): Int {
        return beforeValue - targetValue
    }

    private fun multiplication(
        beforeValue: Int,
        targetValue: Int,
    ): Int {
        return beforeValue * targetValue
    }

    private fun division(
        beforeValue: Int,
        targetValue: Int,
    ): Int {
        return beforeValue / targetValue
    }
}
