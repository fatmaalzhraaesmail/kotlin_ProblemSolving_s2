fun main() {
    val size= readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    Calculates(numbers,size)

}
fun Calculates(inputs: List<Int> , size:Int){
    val evenCount=ArrayList<Int>()
    var oddCount=ArrayList<Int>()
    var positiveCount = ArrayList<Int>()
    var negativeCount=ArrayList<Int>()
   for(i in inputs){

          if(i%2==0) evenCount.add(i)
          if(i%2==1 || i%2==-1) oddCount.add(i)
          if(i>0)  positiveCount.add(i)
          if(i<0) negativeCount.add(i)

   }
    println("Even: "+ evenCount.size)
    println("Odd: "+ oddCount.size)
    println("Positive: "+ positiveCount.size)
    println("Negative: "+ negativeCount.size)
}