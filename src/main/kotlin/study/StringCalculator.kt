package study

import study.enums.FourBasicOperationSymbols
import study.enums.getSymbol

class StringCalculator {
    fun calculator(input: String?): Int {
        val inputs = inputToList(input)
        var result = 0
        var operatorSymbol = FourBasicOperationSymbols.ADD

        for (element in inputs) {
            if (isNumeric(element)) {
                val inputDigit = element.toInt()
                result = FourBasicOperations().operate(result, inputDigit, operatorSymbol)
            } else {
                operatorSymbol = getSymbol(element)
            }
        }
        return result
    }

    private fun inputToList(input: String?): List<String> {
        require(!input.isNullOrEmpty())
        return listOf(*input.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
    }

    private fun isNumeric(s: String): Boolean {
        return runCatching { s.toInt() }.isSuccess
    }
}
