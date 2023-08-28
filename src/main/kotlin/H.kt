fun main(){
    var num=readLine()!!.toInt()
    if(num<2)
        println("NO")
    else if (num==2)
        println("YES")
    else{
        var flag=0
        for(i in 2..(num-1)){
            if(num%i==0)
            {
                println("NO")
                flag=1
                break
            }
        }
        if(flag==0)
            println("YES")
    }

}