class Inventory {
    private val items = mutableListOf<Item>()
    private val endOfDayUpdateRule = EndOfDayUpdateRule()

    fun add(item: Item) {
        this.items.add(item)
    }

    fun endOfDayUpdate() {
        this.items.forEachIndexed { index, item  ->
            this.items[index] = endOfDayUpdateRule.updatedItem(item)
        }
    }

    fun getItem(index: Int): Item? {
       return this.items.getOrNull(index)
    }

}
