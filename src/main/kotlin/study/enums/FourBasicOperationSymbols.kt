package study.enums

enum class FourBasicOperationSymbols(val symbol: String) {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
}

fun getSymbol(symbol: String): FourBasicOperationSymbols {
    return FourBasicOperationSymbols.entries.find { it.symbol == symbol } ?: throw IllegalArgumentException("Invalid symbol: $symbol")
}
