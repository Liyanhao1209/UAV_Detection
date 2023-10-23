package com.example.android_sdk_learning.Kt_learning.ktSingletonClass

object KtSingletonClass{
    fun op(){
        println("singleton")
    }
}

fun main(){
    // IOC,the singleton already exists during compilation
    KtSingletonClass.op()
}