import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class InventoryAcceptanceTest {

    @Test
    fun `An inventory with single standard item`() {
        val inventory = Inventory()
        inventory.add(Item(name = "+5 Dexterity Vest", sellIn = 10, quality = 20))
        inventory.add(Item(name = "Elixir of the Mongoose", sellIn = 5, quality = 7))

        inventory.endOfDayUpdate()

        val firstUpdatedItem = inventory.getItem(0)
        assertNotNull(firstUpdatedItem)
        assertEquals(9, firstUpdatedItem.sellIn)
        assertEquals(19, firstUpdatedItem.quality)

        val secondUpdatedItem = inventory.getItem(1)
        assertNotNull(secondUpdatedItem)
        assertEquals(4, secondUpdatedItem.sellIn)
        assertEquals(6, secondUpdatedItem.quality)
    }
}