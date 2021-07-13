import java.util.*
import Item as Item1

class Eletronic(brand: String, price: Int) : TaxItem(category = "Eletronic", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(date: Date): Double {
        return 0.5
    }
}


/*
*
* open class Food {
    open val price: Double

    constructor(price: Double) {
        this.price = price
    }
}

class Hamburger : Food {
    constructor(price: Double) : super(price)
}
* */