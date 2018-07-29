class HumanBeing constructor(n:String){
    var name : String = ""
    var age : Int = 0


    init {
        name =n
        println("$name : $age")

    }

    constructor(name:String , age : Int): this(name){

        this.name = name
        this.age = age
        println("$name : $age")

    }


    fun run(){
        println("people are running")
    }


}

fun main(args : Array<String>){
    var student = HumanBeing("Yohan", 90)
    student.run()
}