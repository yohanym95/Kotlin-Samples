abstract class Human{ //when we use abstract we want implement it
    abstract fun think()

    fun talk(){
        println("talking")
    }

}

class Doctor : Human(){
    override fun think() {
       println("critical thinking")
    }

}

class Alien : Human(){
    override fun think() {
        println("virtual thinking")
    }

}



fun main(args : Array<String>){

    var mayk : Human = Alien()
    mayk.think()
    mayk.talk()

    var doc : Human = Doctor()
    doc.think()
    doc.talk()

}