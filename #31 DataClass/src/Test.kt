
//1.every class need to string method-data class
//2.equal & hashcodemethode-dataclass
//3.clone- data class,copy method
data class Laptop(val brand : String ,val price : Int){

    fun show(){
        println("Awesome Machine....")
    }


}
fun main(args : Array<String>){

    var lap1 = Laptop("Dell",2000)
    var lap2 = Laptop("Dell",2000)
    var lap3 = lap1.copy(price = 2400); //we can use this method in data class //clone method
    println(lap3)
    println(lap1 == lap2) //when we use data class these a equal in normal clas these are false


}