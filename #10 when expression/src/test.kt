fun main(args : Array<String>){
    //java switch - kotlin when ->

    val num = 2 //Able to use any type data for "when".

    when(num) //Speciality is that no need break statement. Also use "else" key word as "default" part.
    {
        1 -> println("One")
        2 -> println("two")
        3 -> println("three")
        else -> println("Give a right number")
    }

    val str = when(num) //Also we can use this as an expression too.
    {
        1 ->"One"
        2 -> "two"
        3 -> "three"
        else -> "Give a right number"
    }
    println("str is $str")

//"When" key word is very similar to "switch" in java. Use "when" key word as "switch".
}
