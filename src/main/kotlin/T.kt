fun main(){
var x=readLine()!!.toInt()//4
    for(i in 1..x){//1 2 3 4
        for( j in 1..(x) ){//1 2 3 4 5 6 7
            if(j<=x-i)
                print(" ")
        }
        for(k in 1..x){
            print("*")
        }
        println()
    }
}