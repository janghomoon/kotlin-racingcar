package study

class StringCalculator {
    fun calculator(input: String?): Int {
        val inputs = inputToList(input)
        var result = 0
        var operatorSymbol = "+"

        for (element in inputs) {
            when (isNumeric(element)) {
                true -> {
                    val inputDigit = element.toInt()
                    result = FourBasicOperations().operate(result, inputDigit, operatorSymbol)
                }

                false -> {
                    operatorSymbol = getOperatorSymbol(element)
                }
            }
        }
        return result
    }

    private fun getOperatorSymbol(symbol: String): String {
        val symbols = listOf("+", "-", "*", "/")
        require(symbols.contains(symbol))
        return symbol
    }

    private fun inputToList(input: String?): List<String> {
        require(!input.isNullOrEmpty())
        return listOf(*input.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
    }

    @Throws(NumberFormatException::class)
    fun isNumeric(s: String): Boolean {
        return try {
            s.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}
