//fun main(){
//    val (number1,number2) = readLine()!!.split(" ").map { it.toInt() }
//    var next=0
//    var divide:Int
//    var total=0
//    var isLucky=false
//    var stop = true
//    for (i in number1..number2){
//        divide =i
//        total=i
//        while (divide >0){
//            next = divide %10
//            divide /=10
//            if (next == 4 || next==7){
//               isLucky=true
//               if(divide==0){
//                   stop=false
//                   print("$total ")
//               }
//            }
//            else{
//                isLucky =false
//                break
//            }
//        }
//    }
//    if(isLucky ==false && stop ==true){
//        println(-1)
//    }
//}
////

fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val luckyNumbers = mutableListOf<Int>()

    for (num in A..B) {
        if (isLucky(num)) {
            luckyNumbers.add(num)
        }
    }

    if (luckyNumbers.isEmpty()) {
        println("-1")
    } else {
        println(luckyNumbers.joinToString(" "))
    }
}

fun isLucky(num: Int): Boolean {
    var n = num
    while (n > 0) {
        val digit = n % 10
        if (digit != 4 && digit != 7) {
            return false
        }
        n /= 10
    }
    return true
}


