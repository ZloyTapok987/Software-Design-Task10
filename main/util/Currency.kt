package util

enum class Currency(val longName: String, val relativeValue: Double) {

    RUB("Russian Rubles", 1.00),
    USD("US Dollars", 150.0),
    EUR("Euros", 200.0),
    JPY("Japanese Yen", 0.4);

    companion object : Converter {
        override fun convert(amount: Double, fromCurrency: Currency, toCurrency: Currency): Double {
            return amount * fromCurrency.relativeValue / toCurrency.relativeValue
        }
    }

}