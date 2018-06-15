
/*data types and sizes
  Double   64
  Float    32
  Long     64
  Int      32
  Short    16
  Byte     8
 */
fun main(args : Array<String>){
   println("============================================================")
   println("Numbers============")
  val a:Int =10000 //declaring varibale
  val d:Double=100.00
  val f:Float=100.00f
  val l:Long = 1000007
  val s:Short=10
  val b:Byte=1

    println("Your Int value :"+a)
    println("Your Double value :"+d)
    println("Your Float value :"+f)
    println("Your Long value :"+l)
    println("Your Short value :"+s)
    println("Your Byte value :"+b)

    println("===========================================================")
    println("Charaters==========")

    //chracter variable cannot be declared like number variable
    //ONE USING 'var' and another using 'val'

    val letter:Char ='A'//defining variable
    //letter='A'  //Assigning values
    println("your Char Value : "+letter)


    println("============================================================")
    println("Boolean=============")

    val bool:Boolean = true
    println("Your Boolean Value :"+bool)


    println("=============================================================")
    println("String===============")

    //two kinds of String available in kotlin
    /* 1.raw string
       2.escaped String
     */
    val rawString:String ="I am Raw String"
    var escapedString : String = "I am escaped String\n"
    //escapedString="done\n" var can be reassigned 
   // rawString="done" //val cannot be reassigned
    println(escapedString)
    println(rawString)
    //escaped String allows to provide extra line space after the first print statement
    // var is like general variable and its known as a mutable variable in kotlin and can be assigned multiple times
    //vak is like constant varibale and its known as immutable in kotlin and can be intialized only single time

}