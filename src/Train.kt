internal class Train(private val destination: Destination, passengerCount: Int) {
    class Destination(val from: String, val to: String) {
        constructor(cities: List<String>): this(cities[0], cities[1])

        override fun toString(): String {
            return "$from - $to"
        }
    }

    private class Wagon(size: Int, occupied: Int) {
        val size: Int = size.coerceAtLeast(0)
        val occupied: Int = occupied.coerceIn(0, this.size)
    }

    fun depart() {
        println("Поезд ${destination.from} - ${destination.to}, состоящий из ${wagons.size} вагонов отправлен")
        wagons.forEachIndexed { i, wagon ->
            println("Вагон ${i + 1} - мест ${wagon.size}, пассажиров ${wagon.occupied}")
        }
    }

    private val wagons: List<Wagon>

    init {
        val wagons = mutableListOf<Wagon>()
        var remainingPassengers = passengerCount

        while (remainingPassengers > 0) {
            val size = kotlin.random.Random.nextInt(5, 26)

            wagons.add(Wagon(size, remainingPassengers))
            remainingPassengers -= size
        }

        this.wagons = wagons
    }
}
