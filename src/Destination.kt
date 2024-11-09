class Destination(private val from: String, private val to: String) {
    constructor(cities: List<String>): this(cities[0], cities[1])

    override fun toString(): String {
        return "$from - $to"
    }
}
