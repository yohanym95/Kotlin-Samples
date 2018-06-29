import java.util.*

fun main(args:Array<String>){

    var name = TreeMap<String,Int>()
    name["Yohan"]=23
    name["Malsha"]=22
    name["ossa"]=22
    name["Dapa"]=23

    for(i in name) //pritn the name and age
        println(i)
    for((name,age) in name)
        println(" $name : $age")

}