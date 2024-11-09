internal class Salesman {
    fun sellTickets() {
        _ticketsSold = kotlin.random.Random.nextInt(5, 201)
    }

    private var _ticketsSold = 0
    val ticketsSold: Int
        get() {
            return _ticketsSold
        }
}
