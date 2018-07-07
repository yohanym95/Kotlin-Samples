fun main(args : Array<String>){

// In Kotlin "while" and "do-while" loops are similar to java.
// "for" loop is little bit different.

    var number = 1..5 // We can assign a range to a variable.
    //We can also use "var number = 1 until 5". then the range is 1 to 4.

    // Then we can use it in for loop.
    for(a in number){
        print(" $a")
    }

    println("")

    // There is a key word "step" we can use in for loop.
    // It use to skip steps in range. (By default, it is "step 1")
    for(a in number step 2){
        print(" $a")
    }

    println("")

    // We can use the range in descending order.
    var numberInDescOrder = 5 downTo 1
    for(a in numberInDescOrder){
        print(" $a")
    }
    // In here "downTo" is a method in "Int" class (not a key word).
    // It's similar to 16.downTo(1)

    println("")

    //reversed() method to print reverse order.
    for(a in number.reversed()){
        print(" $a")
    }

    println("")

    // count() method is use to get the count.
    println("Count : ${number.count()}")

    // Also we can use a range of characters (in ASCII order).
    var character = 'A'..'z'
    println("Count : ${character.count()}")
    for(a in character) {
        print(" $a")
    }
}
