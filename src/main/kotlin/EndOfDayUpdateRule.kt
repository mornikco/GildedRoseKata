class EndOfDayUpdateRule {
    fun updatedItem(item: Item): Item {
        return Item(
            name = item.name,
            sellIn = item.sellIn - 1,
            quality = item.quality - 1
        )
    }
}
