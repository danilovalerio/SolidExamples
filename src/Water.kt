import Item as Item1

class Water(brand: String, price: Int) : Item1(category = "Water", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(): Double {
        return 0.0
    }
}