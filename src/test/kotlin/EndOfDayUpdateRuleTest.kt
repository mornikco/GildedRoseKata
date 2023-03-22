import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EndOfDayUpdateRuleTest {

    private val rule = EndOfDayUpdateRule()
    private val standardItem = Item(name = "Elixir of the Mongoose", sellIn = 5, quality = 7)

    @Test
    fun `standard items quality decrease by 1`() {
        val updatedItem = rule.updatedItem(standardItem)
        assertEquals(6, updatedItem.quality)
    }

    @Test
    fun `standard items sell-in decrease by 1`() {
        val updatedItem = rule.updatedItem(standardItem)
        assertEquals(4, updatedItem.sellIn)
    }

    @Test
    fun `item name never changes`() {
        val updatedItem = rule.updatedItem(standardItem)
        assertEquals("Elixir of the Mongoose", updatedItem.name)
    }
}