import java.util.*

class Beer(brand: String, price: Int) : TaxItem(category = "Beer", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(date: Date): Double {
        return 0.1
    }
}