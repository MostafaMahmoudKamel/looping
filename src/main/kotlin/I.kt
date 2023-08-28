fun main(){
    var num=readLine()!!.toInt()
    //reverse number
    var str_temp:String=num.toString()//used to reverse num
    var reversed=str_temp.reversed()

          print(reversed.trimStart('0'))//removing start 0 such(012 =12)


    println()
    //palindrome or not
    var stringNum=num.toString()

    var flag=0
    for(i in (0..(stringNum.length/2))){
        if(stringNum[i]!=stringNum[stringNum.length-1-i]){
            println("NO")
            flag=1
            break
        }
    }
    if(flag==0)
        println("YES")
}