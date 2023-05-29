package com.rsk.kotlin

fun main(args: Array<String>) {
//    for (i in args.indices){
//        println("$i ${args[i]}")
//    }
    val items= IntArray(2)
    items[0]=1
    items[1]=2
    for(i in items){
    println(i)}
    val numbers= intArrayOf(1,2,5,6,7)
    numbers.forEachIndexed{index, element -> println("in index $index element is $element") }

}