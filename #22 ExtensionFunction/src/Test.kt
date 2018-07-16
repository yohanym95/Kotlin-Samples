fun main(args:Array<String>){
var tutu = Aliens()
    tutu.Skills="java and kotlin"
    tutu.show()

var tutu1 = Aliens()
    tutu1.Skills="SQL"
    tutu1.show()

var sum = tutu.plus(tutu1)
    sum.show()
}
fun Aliens.plus(a : Aliens):Aliens{ //this function belongs to Aliens then it becomes to extension function

    var newAliens = Aliens()
    newAliens.Skills = this.Skills+" "+ a.Skills

    return newAliens


}