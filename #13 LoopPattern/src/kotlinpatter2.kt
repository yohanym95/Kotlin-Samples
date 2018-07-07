package pattern

import java.util.*

fun main(args:Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter number")
    var n : Int = reader.nextInt()

    for(i in 1..n){
        for(j in n downTo i){
            print(" ")

        }


        for(y in 1..i){
         print("*")
        }
        for(x in 1..i-1){
            print("*")
        }
        println()
    }

}