fun main(args : Array<String>){
    var number = 5
    var factorial = 1

    //This is the normal way to find factorial (Using Loops)
    for(i in 1..number){
        factorial *= i
    }

    // Printing Factorial variable, which calculate in normal way.
    println(factorial)

    // Calling the factorialCal function for recursion.
    println(factorialCal(number))
}

fun factorialCal(number : Int) : Int{
    if(number == 0)
        return 1
    else
        return number * factorialCal(number-1)
}
