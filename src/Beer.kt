import java.util.*
import Item as Item1

class Beer(brand: String, price: Int) : TaxItem(category = "Beer", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(date: Date): Double {
        return 0.1
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