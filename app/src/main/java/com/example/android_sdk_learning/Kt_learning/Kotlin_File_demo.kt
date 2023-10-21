package com.example.android_sdk_learning.Kt_learning

import kotlin.math.max

fun main(){
    println("Hello Kotlin!")
}

//弱类型语言
fun weakType(){
    // final variable
    val a = 10;
    //CE:Val cannot be reassigned!
//    a = 1;
    // not final variable
    var b = "some string"
    b = "another string" // ok to reassign
}

//Any type of param
fun typeMatch(num:Any){
    // Kotlin::is = Java::instanceof
    if(num is Int){
        println("it's a Integer")
    }else{
        println("not a Integer")
    }
}

//similar to typeScript
fun typeInference(){
    val a = 10
    println(a::class) //int (Kotlin reflection is not available)
    val b = "str"
    println(b::class) //class java.lang.String (Kotlin reflection is not available)
}

//similar to typeScript
fun ExplicitDeclare(){
    var a: Int = 10
}

//declare a function/method
/**
 * equivalent to
 * public Integer trivialFunc(Integer param1,Byte param2) in Java
 */
fun trivialFunc(param1:Int,param2:Byte):Int{
    return 1
}

//inline method
fun  inlineFunc(n1:Int,n2:Int) = max(n1,n2)
fun  inlineIf(n1:Int,n2:Int) = if(n1>n2){
    n1
}else{
    n2
}

// if in kt
fun kotlinIf(num1:Int,num2:Int):Int{
    val value = if(num1>num2){
        num1
    }else{
        num2
    }
    return value
}

//switch in kt
fun kotlinSwitch(name:String):Int{
    return when(name){
        "Tom"->10
        "Jimmy"->20
        else->0
    }
}

//complete switch expression
fun ktSwitchExp(name:String):Int{
    return when{
        // kt:: == = Java::Object.equals
        name=="Tom"->10
        else -> 0
    }
}

fun ktFor(){
    //similar to matlab
    var range=0..10 //[0,10]
    println(range::class) //class kotlin.ranges.IntRange (Kotlin reflection is not available)
    //similar to python
    for(i in range){
        println(i)
    }
    range = 0 until 10 // [0,10)
    //specify a step length

    /**
     * equivalent to
     * for(int i = 0; i < 10; i+=2)
     */
    for (i in range step 2){
        println(i)
    }
    range = (10 downTo 1) as IntRange // [1,10] but descend
    /**
     * equivalent to
     * for(int i=10;i>=1;i-=2)
     */
    for(i in range step -2){
        print(i)
    }
}




