fun main(){
    val num= readLine()!!.toInt()
    for (i:Int in 1..12){
        println("$num * $i = "+(num*i))
    }
}