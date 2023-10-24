fun main(){
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val row = "*".repeat(i)
        println(row)
    }
}