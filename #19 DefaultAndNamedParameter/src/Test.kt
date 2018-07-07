fun main(args :Array<String>){
   var finalAmount = calAmount(50,0.03) //when we use default parameter defenitly we dont wnt to use double parameter
    println(finalAmount)
    var namedparaAmount=calAmount(amt=50,Inerest=0.04)//named parameter
    println(namedparaAmount)
    var amount=calAmount(Inerest = 0.04,amt=50)//when we use named parameter we can mobe paramter
    println(amount)
}
@JvmOverloads
fun calAmount(amt : Int,Inerest : Double=0.04) : Int{//double default parameter
    return (amt + amt*Inerest).toInt();


}