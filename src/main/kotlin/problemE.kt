fun main(){
    val size= readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    println(numbers.max())
}