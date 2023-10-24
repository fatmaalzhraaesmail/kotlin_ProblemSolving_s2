fun main(){
    val size= readLine()!!.toInt()
    val numbers= arrayListOf<Int>()
    val numberss=inputs(numbers,size)
    var result=factorial(numberss,size)
    result.forEach(){
        println(it)
    }
}
fun inputs(inputs: ArrayList<Int> , size:Int) : ArrayList<Int> {
    for(i in 0..size-1){
       inputs.add(readLine()!!.toInt())
    }

    return inputs
}
fun factorial(inputs: ArrayList<Int> , size:Int) : ArrayList<Int> {

    val factorials= arrayListOf<Int>()
    for(i in inputs){
        var fact=1
       for(x in 1..i){
           fact*=x
       }
        factorials.add(fact)
    }

    return factorials
}