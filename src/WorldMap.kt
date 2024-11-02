internal class WorldMap(vararg cities: String) {
    fun findCities(count: Int) = cities.shuffled().slice(0..<count)

    private val cities: List<String> = cities.toList()
}
