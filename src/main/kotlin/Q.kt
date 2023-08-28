fun main(){
    var numTest=readLine()!!.toInt()
    for(i in 1..numTest)
    {
        var element=readLine()!!
        var output=element.reversed()
        for (j in 0..output.length-1){
            print("${output[j]} ")
        }
        println()

    }
}