package com.example.android_sdk_learning.Kt_learning.ktInterface

interface KtInterface {
    // only declaration,no function body
    fun op1()
    // with function body
    // equivalent to Java reserved keyword : default (in JAVA 8)
    fun op2(){
        println("original op2")
    }
}

class KtImpl : KtInterface{
    override fun op1() {
        println("override op1")
    }

    override fun op2() {
        println("override op2")
        op1()
    }

}

class defaultImpl : KtInterface{
    override fun op1() {
        TODO("Not yet implemented")
    }

}

fun main(){
    val impl = KtImpl()
    impl.op2() // override op2 \n override op1

    var dimpl = defaultImpl()
    dimpl.op2() // original op2
}