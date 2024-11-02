internal class Salesman {
    fun sellTickets() {
        _ticketsSold = kotlin.random.Random.nextInt(5, 201)
    }

    private var _ticketsSold = 0
    val lastSale: Int
        get() {
            val temp = _ticketsSold
            _ticketsSold = 0
            return temp
        }
}
