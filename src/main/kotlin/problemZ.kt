import kotlin.contracts.contract

fun main(){
    val (k,s) = readLine()!!.split(" ").map { it.toInt() }
    var x:Int
    var y:Int
    var cntr = 0
    for (x in 0..k){
        for (y in 0..k){
            if(s-x-y>=0 && s-x-y<=k)
            {
//                println("$x $y ${s-x+y}")
                cntr++
            }
            else
            {
                continue
            }
        }
    }
    println(cntr)
}