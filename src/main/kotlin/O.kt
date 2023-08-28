fun main(){
    var x=readLine()!!.toInt()
    for(i in 0..x-1){
        for(j in 0..i){
            print("*")
        }
        println()
    }
}