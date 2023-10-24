fun main(){
    val n = readLine()!!.toInt()
    var fib= arrayListOf<Int>()
    fib.add(0,0)
    fib.add(1,1)
    for (i in 2..n-1)
    {
        var fibb=fib[i-1]+fib[i-2]
        fib.add(i,fibb)
    }
 fib.map { print("$it ") }
}