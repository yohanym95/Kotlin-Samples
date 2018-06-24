fun main(args : Array<String>){
    //java switch - kotlin when ->

    val num = 2

    when(num) //when is expression so that we dont use break and contiue to this
    {
        1 -> println("One")
        2 -> println("two")
        3 -> println("three")
        else -> println("Give a right number")
    }

    val str = when(num)
    {
        1 ->"One"
        2 -> "two"
        3 -> "three"
        else -> "Give a right number"
    }
    println("str is $str")


}