package study

class FourBasicOperations {
    fun operate(
        beforeValue: Int,
        targetValue: Int,
        symbol: String,
    ): Int {
        val result: Int =
            when (symbol) {
                "+" -> addition(beforeValue, targetValue)
                "-" -> subtraction(beforeValue, targetValue)
                "*" -> multiplication(beforeValue, targetValue)
                "/" -> division(beforeValue, targetValue)
                else ->  throw IllegalArgumentException()
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
