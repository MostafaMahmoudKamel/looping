fun main(){
    var num:Int=readLine()!!.toInt()

    while(num>0){
        var x=readLine()!!.toInt()
        //fact is long becuase fact 20>pow(10,9)
        var fact:Long=1
        for(i in 1..x)
            fact*=i
        fact
        println(fact)
        num--
    }
}