package com.example.android_sdk_learning.Kt_learning.ktCollections

import java.util.Locale

fun main(){

}

fun findLongestWord(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    var maxLengthFruit = ""
    for (fruit in list) {
        if (fruit.length > maxLengthFruit.length) {
            maxLengthFruit = fruit
        }
    }
    println("max length fruit is " + maxLengthFruit)
}

// similar to Java Stream ops
fun FunctionalAPIfindLongestWrod(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    // similar to method reference in java (it.length)
    val maxLengthFruit = list.maxBy { it.length }
    println("max length fruit is " + maxLengthFruit)
}

fun lambdaExpFindLongestWord(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val lambda = {fruit:String -> fruit.length}

    /**
     * these four are equivalent
     */
    var maxLengthFruit = list.maxBy(lambda)
    maxLengthFruit = list.maxBy({fruit:String -> fruit.length})
    maxLengthFruit = list.maxBy(){fruit:String->fruit.length}
    maxLengthFruit = list.maxBy{fruit:String->fruit.length}

    //simplify
    maxLengthFruit = list.maxBy{fruit->fruit.length}
    //it as a reserved word
    maxLengthFruit = list.maxBy{it.length}

}

fun FunctionalMapperAPI(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val newList = list.map { it.uppercase(Locale.getDefault()) }
    for (fruit in newList) {
        println(fruit)
    }
}

fun FunctionalFilterAPIAndChainInvoke(){
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val newList = list.filter { it.length <= 5 }
        .map { it.uppercase(Locale.getDefault()) }
    for (fruit in newList) {
        println(fruit)
    }
}












