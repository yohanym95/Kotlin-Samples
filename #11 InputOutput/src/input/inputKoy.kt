package input

fun main(args : Array<String>){
    println("Input output in kotlin")
    println("Enter Your Name : ")
    var name :String = readLine().toString()
    println("Enter your Age : ")
    var age : Int = readLine()!!.toInt()
    println("Enter Your Age :")
    var age1 : Int = Integer.valueOf(readLine()) //another type to get input in kotlin


}