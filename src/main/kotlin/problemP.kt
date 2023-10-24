fun main(){
    val n = readLine()!!.toInt()

    for (i in n downTo  1  ) {
        val row = "*".repeat(i)
        println(row)
    }
}