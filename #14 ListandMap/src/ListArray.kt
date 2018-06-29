fun main(args:Array<String>){

    var list1 = arrayOf(1,2,3,4,5)//declare and intiliaze array
    for(item in list1)
        println(item)

    for(items in list1.indices) //array with index number
        println("$items : "+list1[items])

    var itemss = listOf(1,2,3,4)//declare amd initialize a list

    for(i in itemss) //print the list
        println(i)

    for((i,e) in itemss.withIndex()) //withindex method return two things value and elemnt in array
        println(" $i : $e")

}