package com.example.android_sdk_learning.Kt_learning.ktCollections

fun main(){

}

fun listAdd():List<Any>{
//    var ans = ArrayList<Any>()
//    ans.add('c')
//    ans.add(1)
//    ans.add("anything")
    // syntactic sugar
//    val ans = listOf<Any>('1',"str",0.0) // a final list,unchangeable
    val ans = mutableListOf<Any>('1',"str",0.0)
    ans.add(0x3f)
    return ans
}

fun enhancedFor(){
    val ans = listOf<Any>('1',"str",0.0)
    for (something in ans) {
        println("knock knock")
    }
    var mof = mutableMapOf<String,Int>("1" to 1,"2" to 'c'-'0')
    for ((key,value) in mof) {
        println("$key $value")
    }
}

fun ktMap(){
    val map = HashMap<String,Int>()
    map.put("str1",1)
    val str1num = map.get("str1")
    //syntactic sugar
    map["str2"] = 2
    val str2num = map["str2"]
    //syntactic sugar
    var mof = mutableMapOf<Any,Any>("1" to 1,"2" to 'c') // ti as a infix function
}


