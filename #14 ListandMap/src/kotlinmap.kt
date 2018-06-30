import java.util.*

fun main(args : Array<String>){

    println("Map in Kotlin")

    var details =  TreeMap<String ,Int>()
    details["Yohan"]= 78
    details["jewaa"]=89
    details["ossa"]=90
    details["noom"]=90
    details["doon"]=78


    println(details)

    println()
    for(i in details) //this for loop like a foreach method
        println(i)

    println()
    for((name,age) in details)
        println(" $name : $age")

}