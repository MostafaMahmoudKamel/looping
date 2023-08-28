fun main(){
    var s=readLine()!!//char + - / *
    var lenList=readLine()!!.toInt()
    var list=readLine()!!.split(" ")
    for(i in 0..(lenList-1)){
        for(j in 0..(list[i].toInt()-1)){
            print(s)
        }
        println()
    }
}