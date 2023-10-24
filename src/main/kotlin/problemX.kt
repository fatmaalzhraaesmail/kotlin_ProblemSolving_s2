fun main(){
    val n = readLine()!!.toInt()
    repeat(n){
        var counter = 0
        var x = readLine()!!.toInt()
        while (x !=0){
            var digit = x%2
            if(digit == 1){
                counter++;
            }
            x/=2
        }


        var y = 0
        var decimal =0
        for(z in 1..counter){
            decimal +=( 1*(Math.pow(2.0,y.toDouble())).toInt() )
            y++
        }
        println(decimal)
    }
}