fun main(){
    var input=readLine()!!.split(" ")
    var n=input[0].toInt()
    var a=input[1].toInt()
    var b=input[2].toInt()
    var sumRes=0
    for(i in 1..n){ //1..n
        var temp=i//asign value of number i to temp//1..n
        var sumdigit=0 // 23=2+3=5
        while(temp>0){
            sumdigit+=(temp%10)
            temp/=10
        }
        if(sumdigit>=a&&sumdigit<=b){
            sumRes+=i
        }
    }
    println(sumRes)
}