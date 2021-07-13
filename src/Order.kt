import java.util.*

class Order() {
    //pedido tera codigo uma lista de itens
    lateinit var code: String
    val listItem: MutableList<Item> = mutableListOf()

    init {
        this.code = (Math.random() * 100).toString()
    }

    fun addItem(item: Item) {
        this.listItem.add(item)
    }

    fun getSubtotal(): Int {
        var total = 0
        for (item in this.listItem) {
            total += item.price
        }
        return total
    }

    fun getTaxes(date: Date): Double {
        var taxes = 0.0
        for (item in this.listItem) {
            //Se item é uma instancia de TaxItem ele terá imposto
            if (item is TaxItem) {
                taxes += item.calculateTaxes(date)
            }
        }
        return taxes
    }

    fun getTotal(date: Date): Double {
        return getSubtotal() + getTaxes(date)
    }

}
