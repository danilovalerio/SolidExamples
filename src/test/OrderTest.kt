package test

import Beer
import Cigar
import Order
import Water
import org.junit.Test
import soma
import java.util.*
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
        order.addItem(Cigar("Eight", 8))
        order.addItem(Beer("Glacial", 5))
        order.addItem(Water("Bem Barato", 5))
        val subtotal = order.getSubtotal()
        val expected = 18

        assertEquals(expected, subtotal)
    }

    @Test
    fun `Deve calcular os impostos do pedido`() {
        val order = Order()
        order.addItem(Cigar("Eight",8)) //0.2 = 1.6
        order.addItem(Beer("Glacial",5)) //0.1 = 0.5
        order.addItem(Water("Bem Barato",5)) // 0.0
        val impostos = order.getTaxes(Date("2021/07/09"))
        val expected = 2.1

        assertEquals(expected, impostos)
    }

    @Test
    fun `Deve calcular os impostos no mes comemorativo pedido`() {
        val order = Order()
        order.addItem(Cigar("Eight",8)) //0.1 = 0.8
        order.addItem(Beer("Glacial",5)) //0.1 = 0.5
        order.addItem(Water("Bem Barato",5)) // 0.0
        val impostos = order.getTaxes(Date("2021/01/09"))
        val expected = 1.3

        assertEquals(expected, impostos)
    }

    @Test
    fun `Deve calcular o total do pedido`() {
        val order = Order()
        order.addItem(Cigar("Eight",8)) //0.2 = 1.6
        order.addItem(Beer("Glacial",5)) //0.1 = 0.5
        order.addItem(Water("Bem Barato",5)) // 0.0
        val total = order.getTotal(Date("2021/07/09"))
        val expected = 20.1

        assertEquals(expected, total)
    }
}