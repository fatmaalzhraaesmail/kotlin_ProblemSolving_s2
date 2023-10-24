fun main() {
    val num= readLine()!!.toInt()
    for(i in 2 until num+1) {
        when
        {
            i%2==0 ->println(i)
            else ->continue
        }

    }

}