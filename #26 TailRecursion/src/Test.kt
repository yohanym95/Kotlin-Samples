import java.math.BigInteger

fun main(args : Array<String>){

    var num = BigInteger("70000")

    println(fact(num, BigInteger.ONE))

}
//when we want find big number factorial use tailrec with recursion , its optimize compling
tailrec fun fact(num : BigInteger,result : BigInteger):BigInteger{

    if(num == BigInteger.ZERO)
        return result
    else
        return fact(num - BigInteger.ONE, num * result)


}