import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class InventoryTest {

    private val inventory = Inventory()

    private val dexterityVestItem = Item(name = "+5 Dexterity Vest", sellIn = 10, quality = 20)
    private val elixirItem = Item(name = "Elixir of the Mongoose", sellIn = 5, quality = 7)

    @BeforeEach
    fun setUp() {
        inventory.add(dexterityVestItem)
        inventory.add(elixirItem)
    }

    @Test
    fun `get first item in an empty inventory`() {
        val inventory = Inventory()
        val actual = inventory.getItem(0)
        assertNull(actual)
    }

    @Test
    fun `get added items by index`() {
        assertEquals(dexterityVestItem, inventory.getItem(0))
        assertEquals(elixirItem, inventory.getItem(1))
    }

    @Test
    fun `get index out of bound item`() {
        assertNull(inventory.getItem(2))
        assertNull(inventory.getItem(42))
        assertNull(inventory.getItem(-1))
    }
}