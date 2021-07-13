import java.util.*

/**
 * Segregamos Tax (imposto) para TaxItem, pois nem todos os itens terão impostos
 */
abstract class TaxItem(category: String, brand: String, price: Int) : Item(category, brand, price) {

    fun calculateTaxes(date: Date): Double {
        return this.price * this.getTax(date)
    }

    abstract fun getTax(date: Date): Double
}