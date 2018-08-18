interface Human{
    fun think()
}

interface Program{
    fun programming()
}

fun main(args: Array<String>){
    var programmer : Human = object :Human { //anonymous inner class
        override fun think() {
            println("Think Virtually")

        }

    }
    programmer.think()
    var skills : Program = object : Program{
        override fun programming() {
            println("programming make happy me")
        }

    }
    skills.programming()
}
