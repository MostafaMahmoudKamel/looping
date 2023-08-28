fun main(){
    var num=readLine()!!.toInt()
    for( i in 2..num){
        calcFactorial(i)
        print(" ")
    }
}
fun calcFactorial(num:Int):Unit{
    if(num==2) print(2)
    else{
        var flag=0//prime  or not flags
        for(i in 2..(num-1)){
            if(num%i==0){//not prime
                flag=1
                break
            }
        }
        if(flag==0) print(num)
    }
}