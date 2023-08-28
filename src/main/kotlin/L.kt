import kotlin.math.*
fun main(){
    var input=readLine()!!.split(" ")
    var x=input[0].toInt()
    var y=input[1].toInt()
    var max=max(x,y)
    var min=min(x,y)
    var gcd=max%min
    if(gcd==0)//x%y==0
        println(min(x,y))
    else
    {
        var res=max-min
    }

}