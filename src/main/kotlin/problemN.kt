//fun main(){
//    val symbol = readLine()!!.trim()
//    val it = readLine()!!.toInt()
//    val input= readLine()!!.split(" ").map { it.toInt() }
//    for ( i in input){
//        println(printstatment(i,symbol))
//    }
//
//}
//fun printstatment(num:Int,symbol:String):String{
//    var statment = ""
//    for ( i in 1..num)
//    {
//       statment+=symbol
//    }
//    return statment
//}


///
fun main() {
    val symbol = readLine()!!.trim()
    val n = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }

    for (num in numbers) {
        println(symbol.repeat(num))
    }
}