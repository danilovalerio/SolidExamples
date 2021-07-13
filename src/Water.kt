import Item as Item1

class Water(brand: String, price: Int) : Item1(category = "Water", brand = brand, price = price) {
    override val price: Int = price

    override fun getTax(): Double {
        //TODO: Agora agua nao tem imposto, acabou quebrando o programa. segundo o L de SOLID isso não deveria acontecer
        throw Error("Nao tem imposto para agua")
    }
}