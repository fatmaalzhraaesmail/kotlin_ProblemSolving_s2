fun main() {
    val it = readLine()!!.toInt()

    repeat(it) {
        val N = readLine()!!.toLong()
        printDigits(N)
        println()
    }
}

fun printDigits(number: Long) {
    var n = number
    val digits = mutableListOf<Long>()

    if (n == 0L) {
        digits.add(0)
    } else {
        while (n > 0) {
            digits.add(n % 10)
            n /= 10
        }
    }

    print(digits.joinToString(" "))
}