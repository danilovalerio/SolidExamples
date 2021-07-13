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

    fun getTaxes(): Double {
        var taxes = 0.0
        for (item in this.listItem) {
            if (item.name == "Cigar") {
                taxes += item.price * 0.2
            }

            if (item.name == "Beer") {
                taxes += item.price * 0.1
            }
        }
        return taxes
    }

    fun getTotal(): Double {
        return getSubtotal()+getTaxes()
    }

}
