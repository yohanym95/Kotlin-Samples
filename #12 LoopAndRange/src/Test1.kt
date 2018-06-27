fun main(args : Array<String>){

    var marks = arrayOf(78,89,34,56,90)
    for(item in marks) //like foreach
        println(item)

    for(items in marks){//can use bracket
        println(items)
    }

    println("print array")

    for( itemss in marks.indices) /// The elements of an array are iterated on the basis of indices (index) of array.
        println("marks[$itemss] :"+marks[itemss])

}