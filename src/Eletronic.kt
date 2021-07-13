import java.util.*

class Eletronic(brand: String, price: Int) : TaxItem(category = "Eletronic", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(date: Date): Double {
        return 0.5
    }
}