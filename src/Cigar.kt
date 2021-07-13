import java.util.*

class Cigar(brand: String, price: Int) : TaxItem(category = "Cigar", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(): Double {
        val today = Date() //TODO: Dependencia interna, nao tem como testar
        //Num mês específico o imposto do cigarro será mais para motivar o consumo
        if (today.month === 0) {
            return 0.1
        }

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