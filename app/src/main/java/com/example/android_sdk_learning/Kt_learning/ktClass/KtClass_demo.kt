package com.example.android_sdk_learning.Kt_learning.ktClass

class KtClass_demo {
    var field1 = 1

    fun op1() = println(field1)
}

//make non-abstract class extendable
//arbitrary n-a class in kt is final
open class parent(deprecatedArg:Any){
    var pfield = "I'm parent"
}

//Java中，子类必须调用父类构造方法，那么具体调用哪个？
//用括号指示，比如parent(deprecatedArg = ccArg)
open class child(ccArg:Any,da: Any) : parent(deprecatedArg = da){
    val cfield = "final child field"
    var cc = 1

    //logic in Constructor
    init {
        //force type cast:as
        cc = ccArg as Int
        println(cc)
    }
}

class grandChild(pda:Any,ccArg: Any,gcArg:Any) : child(ccArg = ccArg, da = pda){
    var gcArg:Any
    init {
        this.gcArg = gcArg
        println(this.gcArg)
    }
    //次构造函数
    constructor(gcArg: Any) : this(1,1,gcArg)
    constructor(pda:Any,ccArg: Any) : this(pda, ccArg,1)
}



