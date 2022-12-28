package com.example.myapplication

fun main(){
    println(max2(3 ,5))
    println("how commit")

}


fun max(a :Int,b:Int):Int{
    if(a>b){
     return a
    }else{
        return b
    }
}

fun max2(a:Int,b:Int):Int = if(a>b) a else b