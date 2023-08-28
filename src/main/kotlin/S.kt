import kotlin.math.max
import kotlin.math.min
fun main(){
var len=readLine()!!.toInt()
    for(i in 0..len-1){
        var input=readLine()!!.split(" ")
        var x=input[0].toInt()
        var y=input[1].toInt()
        var min=min(x,y)
        var max=max(x,y)
        var sum=0
        //execluding min,max in loop
        for(j in min+1..max-1){
            if(j%2!=0)
                sum+=j
        }
        println(sum)



    }

}