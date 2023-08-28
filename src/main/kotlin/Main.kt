fun main(){
    //Array must be initialalized
    var arr=Array<String>(5){readLine()!!}
    arr[0]="mostafa"
    arr[1]="desha"
    println(arr[0]+arr[2])
    arr.forEach{println(it)}

}