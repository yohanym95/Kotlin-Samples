abstract class OS{
     abstract fun os()

    fun operating(){
        println("Operating Systems")
    }
}

class Android : OS(){
    override fun os() {
      println("Most powerful Os")
    }

}

class IOS : OS(){
    override fun os() {
        println("Most Secure OS")

    }

}

class Windows : OS(){
    override fun os() {
        println("i am dieing")
    }

}

fun main(args : Array<String>){
    var a : OS = Android()
    a.operating()
    a.os()
    var i : OS = IOS()
    i.operating()
    i.os()

}