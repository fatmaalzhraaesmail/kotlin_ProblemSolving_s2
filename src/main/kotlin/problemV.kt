fun main(){
    val n = readLine()!!.toInt()
    var cntr = 1
    for (i in 1..n) {
        println("$cntr ${cntr + 1} ${cntr + 2} PUM")
        cntr += 4
    }

}