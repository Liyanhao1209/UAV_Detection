package com.example.android_sdk_learning.Kt_learning.ktClass

import com.example.android_sdk_learning.Kt_learning.ktClass.child
import com.example.android_sdk_learning.Kt_learning.ktClass.grandChild

fun main(){
    val child = child(2,"da") // 2
    var grandchild = grandChild("pda", 1) // 1(child) 1(grandChild)
    grandchild = grandChild("gcArg") // 1(child) gcArg(grandChild)
}