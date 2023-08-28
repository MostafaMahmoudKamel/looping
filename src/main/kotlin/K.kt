fun main(){
    var x=readLine()!!.toInt()
    for(i in 1..x){
        if(x%i==0) println(i)
    }
}