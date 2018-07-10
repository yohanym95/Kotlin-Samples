fun main(args:Array<String>){
    var str : String = "4a"
    var num : Int   =0

    try{
        num=str.toInt()

    }catch(e : Exception){
        println("Give proper input like 4")

    }
    num++
    println(num)
}