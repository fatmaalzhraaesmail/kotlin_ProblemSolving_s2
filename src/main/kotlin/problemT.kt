fun main(){

    val n = readLine()!!.toInt()
    val totalColumns = 2 * n - 1
    val middleColumn = n - 1

    for (row in 0 until n) {
        for (col in 0 until totalColumns) {
            if (col >= middleColumn - row && col <= middleColumn + row) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
0 1 2 3 4 5 6
0     *
1   * * *
2 * * * * *
* * * * * * *