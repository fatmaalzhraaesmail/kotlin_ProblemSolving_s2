import kotlin.math.max

fun main(){
    val it= readLine()!!.toInt()
    repeat(it){
        val (x,y)= readLine()!!.split(" ").map { it.toInt() }
        println(sumOdd(x,y))
    }
}
fun sumOdd(x:Int , y:Int):Int{
    var minmum= minOf(x,y)
    var maxmum = max(x,y)
    var summation=0
    for (i in minmum until  maxmum){
      summation += if(i%2==1) i else continue
    }
    return summation
}