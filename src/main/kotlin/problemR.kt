fun main() {
    while (true) {
        val (x,y) = readLine()!!.split(" ")?.map { it.toInt() } ?: break
        if (x <= 0 || y <= 0) {
            break
        }

        val numbers = if (x <= y) {
            x..y
        } else {
            y..x
        }

        val sum = numbers.sum()
        val output = numbers.joinToString(" ")

        println("$output sum = $sum")
    }
}