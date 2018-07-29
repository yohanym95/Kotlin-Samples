//in kotlin,default class are final
//open mean then we can unite with other class

open class Human {

    constructor(age : Int,name : String){
     println("$age : $name")
    }
   fun think(){
       println("Real thinking")
   }
}

class Alien  : Human(age = 9,name = "yohan") {
    var age : Int =89
    var name : String ="yohan"



}
fun main(args:Array<String>){

    var huda = Human(89,"yohan")
   // huda.think()
    var huda1 = Alien()
    huda1.think()
}