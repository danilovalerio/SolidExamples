data class Item(
    val category: String,
    val brand: String,
    val price: Int
) {

    fun calculateTaxes(): Double {
        var taxes = 0.0
        if (this.category == "Cigar") {
            taxes += this.price * 0.2
        }

        if (this.category == "Beer") {
            taxes += this.price * 0.1
        }

        return taxes
    }
}
