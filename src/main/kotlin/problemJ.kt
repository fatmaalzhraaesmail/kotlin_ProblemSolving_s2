fun main(){
    val num = readLine()!!.toInt()
    for(i:Int in 2..num){
        var isTrue ="false"
        for (x:Int in  2..i-1){
            if (i % x == 0){
                isTrue = "true"
            }
          }
        if (isTrue == "false"){
            print("$i ")
        }
    }
}