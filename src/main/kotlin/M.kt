//lucky number is the that all digit consist of 4 and 7 only
fun main(){
    //inputs
    var input=readLine()!!.split(" ")
    var x=input[0].toInt()
    var y=input[1].toInt()
    var isLucky=false
    for(i in x..y) {
        //if function return number is (not null and !=-1)
        if(checkLuck(i)!=null&&checkLuck(i)!=-1){
            isLucky=true
            print(i)
            print(" ")
        }
    }
    //not found lucky number(not 4 or 7 )
    if(isLucky==false){
        print(-1)
    }


}
//function check if number is lucky or not
//if number is lucky  return number else return -1
fun checkLuck(num:Int):Int{

    var flag=0//lucky or not
    // I used temp to change variable"num" value without changing num value
    var temp=num//temp access to variable num to unchange value of num
    while(temp>0) {
        if (temp % 10 == 4 || temp % 10 == 7) {//not lucky
            temp /= 10
        }
        else {
            flag=1
            break
        }

    }
    if(flag==0) {
        return num//lucky number
    }
    else
        return -1//not lucky


}