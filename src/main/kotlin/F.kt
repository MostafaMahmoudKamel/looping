fun main(){
    //find multiplication table of specific number
var num=readLine()!!.toInt()
    for(i in 1..12)
        println("$num * $i = ${num*i}")
}