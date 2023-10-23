package com.example.android_sdk_learning.Kt_learning.ktDataClass

// similar to lombok
// equals\hashCode\toString are automatically generated
data class KtDataClass (val string:String,val double:Double)

fun main(){
    val d1 = KtDataClass("str",0.0) // KtDataClass(string=str, double=0.0)
    val d2 = KtDataClass("str",0.0) // true
    println(d1)
    println(d1 == d2)
}