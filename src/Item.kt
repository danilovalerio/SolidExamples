abstract class Item(
    val category: String,
    val brand: String,
    open val price: Int
) {

    fun calculateTaxes(): Double {
        return this.price * this.getTax()
    }

    abstract fun getTax(): Double
}
