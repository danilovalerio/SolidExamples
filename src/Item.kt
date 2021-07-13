data class Item(
    val name: String,
    val brand: String,
    val price: Int
) {

    fun calculateTaxes(): Double {
        var taxes = 0.0
        if (this.name == "Cigar") {
            taxes += this.price * 0.2
        }

        if (this.name == "Beer") {
            taxes += this.price * 0.1
        }

        return taxes
    }
}
