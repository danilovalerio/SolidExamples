import Item as Item1

class Cigar(brand: String, price: Int) : Item1(category = "Cigar", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(): Double {
        return 0.2
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