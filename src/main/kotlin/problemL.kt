fun main(){
   val (x,y) = readLine()!!.split(" ").map { it.toInt() }
   println(gcd(x,y))
}
fun gcd(x:Int , y:Int) : Int{
   if(y ==0) {
       return x
   }
    return gcd(y, x%y)
}

