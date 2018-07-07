fun main(args:Array<String>){
    var str :String ="4"
    var num : Int = str.toInt()//when we use kotlin we can use toInt method for String to integer
    var num1 : Int = Integer.parseInt(str)//also all the java class and method available in kotlin so we can use that method too.

    println(num)
    println(num1)
    num++
    println(num)

}