fun main(args : Array<String>){
    println("For Loop AND Range")
     for( i in 1..5) //printing 1 to 5 -up // range
         print(i)
    println()

    for(i in 5..1) // print nothing  //look down
        print(i)
    println()

    for(i in 5 downTo 1)
        print(i)
    println()

    for(i in 1..5 step 2)
        print(i)
    println()

    for(i in 5 downTo 1 step 2)
        print(i)
    println()

    for(i in 1 until 5)
        print(i)


}