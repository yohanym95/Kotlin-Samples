// This is the same example in previous lesson.
fun main(args : Array<String>){

    var a1 = Test()
    a1.str = "a1"
    a1.testStr()

    var a2 = Test()
    a2.str = "a2"
    a2.testStr()

    //what is we want to make this more similar to English. a1.plus(a2) -> a1 plus a2.
    var a3 = a1 plus a2
    a3.testStr()

    // Operator Overloading
    // In here we tell when we have two objects what to do with the plus operator. (We should use plus function with "+".
    var a4 = a1 + a2
    a4.testStr()

}

//Using "inflix" key word, we can do a1.plus(a2) -> a1 plus a2.
//Using "operator" key word, we can overload "+" operator.
operator infix fun Test.plus(a : Test) : Test {
    var newTest = Test()
    newTest.str = this.str +" "+ a.str

    return newTest
}