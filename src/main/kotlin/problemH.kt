fun main(){
    val num = readLine()!!.toInt()
    if(num == 0 || num <0){
        println("No")
        return
    }
    for (i in 2..(Math.sqrt(num.toDouble())).toInt()){

        if(num % i ==0){
            println("No")
            return
        }

    }
      println("Yes")
}