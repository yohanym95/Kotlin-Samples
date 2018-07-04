//if u didnt like your kotlin class name u can use jvm annotations
@file:JvmName("First")
fun main(args : Array<String>){

add(2,3)
 println()
sum(3,5)
    println()
sum1(56,78)



}

fun add(a : Int,b : Int){
    println(a+b)
}

fun sum(a : Int , b : Int) : Int =a+b

fun sum1( a: Int, b : Int) : Int = if(a>b) a else b

