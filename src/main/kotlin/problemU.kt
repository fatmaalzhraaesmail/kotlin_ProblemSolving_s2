fun main(){
    val (x,y,z) = readLine()!!.split(" ").map { it.toInt() }
    val sum = summation(x,y,z)
    println(sum)

}

fun summation(x: Int, y: Int, z: Int): Int {
    var sum = 0
    for (num in 1..x) {
        val digitSum = num.toString().sumBy { it.toString().toInt() }
//        println("d: $digitSum")
        if (digitSum in y..z) {
            sum += num
        }
    }
    return sum
}