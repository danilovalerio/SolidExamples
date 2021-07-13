/**
 * Segregamos Tax (imposto) para TaxItem, pois nem todos os itens terão impostos
 */
abstract class TaxItem(category: String, brand: String, price: Int) : Item(category, brand, price) {

    fun calculateTaxes(): Double {
        return this.price * this.getTax()
    }

    abstract fun getTax(): Double
}