fun main(){
    var lenList=readLine()!!.toInt()
    var list=readLine()!!.split(" ")
    var max=0
    for( i in 0..(lenList-1)){
        var element=list[i].toInt()
        if(element>max)
            max=element
    }
    println(max)
    // other way to find max of list

//    var res=list.maxOrNull()
//    println(res)
}