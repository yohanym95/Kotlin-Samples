fun main(args : Array<String>){

    var a1 = Test()
    a1.Skills = "java and kotlin"
    a1.show();

    var a2 = Test()
    a2.Skills ="SQL"
    a2.show()

    var sum = a1 plus a2 //use infix
    sum.show()
    var sum1 = a1 + a2 //operator overloading
    sum.show()


}

operator infix fun Test.plus(a : Test) : Test{ //use operator keyword for operator overloading

    var newTest = Test()
    newTest.Skills = this.Skills+" "+a.Skills

    return  newTest

}