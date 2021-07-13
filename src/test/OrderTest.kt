package test

import Item
import Order
import org.junit.Test
import soma
import kotlin.test.assertEquals

class OrderTest {
    @Test
    fun `Deve somar dois valores`() {
        val um = 1
        val dois = 2
        val expected = 3

        assertEquals(expected, soma(um, dois))
    }

    @Test
    fun `Deve calcular o subtotal do pedido`() {
        val order = Order()
        order.addItem(Item("Cigar", "Eight", 8))
        order.addItem(Item("Beer", "Glacial", 5))
        order.addItem(Item("Water", "Bem Barato", 5))
        val subtotal = order.getSubtotal()
        val expected = 18

        assertEquals(expected, subtotal)

    }

    @Test
    fun `Deve calcular os impostos do pedido`() {
        val order = Order()
        order.addItem(Item("Cigar", "Eight", 8)) //0.2 = 1.6
        order.addItem(Item("Beer", "Glacial", 5)) //0.1 = 0.5
        order.addItem(Item("Water", "Bem Barato", 5)) // 0.0
        val impostos = order.getTaxes()
        val expected = 2.1

        assertEquals(expected, impostos)

    }
}