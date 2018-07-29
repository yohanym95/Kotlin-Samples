//these constructor called primary constructor
class Human constructor( n: String) { //we can create construcor with use constructor keyword or without constructor keyword

    var name : String = ""
    var age : Int = 0
    init { //intiliazer block in kotlin
        name =n
        println("Human is here  $age")
        println("Human is here  $name")
    }

    constructor(age : Int , name : String) : this(name) //secondary constructor
    {
        this.name = name
        this.age = age
        println("constructor $age")
    }

    fun walk(){
        println("walking to goal.... $name ");
    }

}
/*
class Alien (var age1 : Int=90){//also we can use deafult value for parameter in constructor

    var Age : Int =age1

    fun think(){
        println("Aliens are better than human..$age1")
    }
}*/


fun main(args:Array<String>){
    println("ooo")
    var h = Human(89,"Yohan") //passing value to constructor
    println("done")
    h.walk()
  /*  var a = Alien(89)
    a.think()
    var a1 = Alien()//use deafult parameter
    a1.think()  */



}