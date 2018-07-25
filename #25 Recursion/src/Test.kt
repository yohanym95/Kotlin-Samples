//function calling it self

fun main(args : Array<String>){
   var num = 5

   println(fact(num))
}
fun fact(num : Int):Int {
    var Fact : Int =1

    if(num==0)
        return 1;
    else
        return num*fact(num-1)


}