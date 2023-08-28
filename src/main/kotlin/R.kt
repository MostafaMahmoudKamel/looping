import kotlin.math.*
fun main(){
    while(true){
        var list=readLine()!!.split(" ")
        var x=list[0].toInt()
        var y=list[1].toInt()
        var max=max(x,y)
        var min=min(x,y)
        if(max<=0||min<=0)
            break
        else{
            var sum=0
            for(i in min..max){
                print("$i ")
                sum+=i
            }
            print("sum =$sum")
            println()
        }
    }
}