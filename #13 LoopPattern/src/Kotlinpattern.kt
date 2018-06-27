package pattern

import java.util.*

fun main(args:Array<String>){
    val reader = Scanner(System.`in`)
    println("number of row in star pattern ")
    var n : Int = reader.nextInt()
    for(i in 1..n){
        for(j in 1..i){
            print("*")
        }
        println()
    }
    for(i in 1..n-1 ){
        for(j in n-1 downTo i){
            print("*")
        }
        println()
    }

}