fun main(args : Array<String>){ //java called method to function

    add(3,4)

    var sum = add1(2,4)
    println(sum)
    var result = sum1(2,1)
    println(result)


    
}

fun add(a : Int,b : Int){   // define a method  ///use parameter in this function
println(a+b)
}

fun add1(c : Int,d : Int) : Int{ //USE REUTEN KEY WORD INT

    return c+d;
}

fun sum1(x : Int,y : Int) : Int = x+y //this function will return expression first we use return keyword but now we dont want it

fun max(a : Int , b : Int) : Int = if(a>b) a else b
