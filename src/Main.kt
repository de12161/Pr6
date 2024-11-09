fun main() {
    val salesman = Salesman()
    val worldMap = WorldMap(
        "Бийск",
        "Барнаул",
        "Санкт-Петербург",
        "Москва",
        "Пермь",
        "Воронеж",
        "Выборг",
        "Галич",
        "Волгоград",
        "Владимир",
        "Владивосток",
        "Гай",
        "Глазов",
        "Киров",
        "Кострома"
    )

    while (true) {
        println("create - составить поезд")
        println("exit - выход")
        print("Выберите действие: ")
        val input = readln()

        if (input == "exit") break

        if (input == "create") {
            val destination = Train.Destination(worldMap.findCities(2))
            println("Создано направление $destination")

            salesman.sellTickets()
            val ticketCount = salesman.ticketsSold
            println("Продано $ticketCount билета(ов)")

            val train = Train(destination, ticketCount)
            println("Сформирован поезд")

            train.depart()

            continue
        }

        println("Команда не распознана")
    }
}
