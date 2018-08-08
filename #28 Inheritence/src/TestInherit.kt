open class Test{//in kotlin default classes are final then we use open keyword and then we can unite class
  open  fun think(){//in kotlin by default all the function and classes are fina

        println("huda is slow walker and always try to do best and right things")
    }
}

class Test2 : Test(){//inherit the class test //also u cannot go with muliple inherite in kotlin like java

 override fun think(){
    println("virtual thinking")

}

}


fun main(args:Array<String>){

    var hudz : Test = Test2() // Human h = new Aliens()
    hudz.think()


}