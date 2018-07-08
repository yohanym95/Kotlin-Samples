fun main(args:Array<String>){
   var str : String = "4a"

   var num : Int = try{ //try expression
       str.toInt()//if this is right then assign to  num
   }catch (e : Exception){
       0// try block is wrong then assign to 0
   }
    num++
    println(num)
}