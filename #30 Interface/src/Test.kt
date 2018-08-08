interface A{ //by the default all methods are abstract in interface
    fun show()
    fun abc(){
        println("abc")
    }
}


interface B{
    fun display()
    fun abc(){
        println("abc")
    }
}

class C : A,B{
    override fun abc() {
        super<A>.abc()
        super<B>.abc()
        println("in abc c")
    }

    override fun display() {
        println("in display")
    }

    override fun show() {

        println("in show")

    }

}

fun main(args : Array<String>){
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()

}
