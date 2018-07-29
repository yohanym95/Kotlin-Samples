open class  School(var NoOfTeachers : Int){

   init {
       println("$NoOfTeachers")
   }

}

open class Class(var NoOfStudent : Int) : School(38){
    fun studying(){
        println("$NoOfStudent")

    }

}
class Student(var Name : String):Class(200){
    fun learing(){
        println("$Name")
    }

}



fun main(args:Array<String>){
    var tissa = School(56)
    var grade = Class(700)
    grade.studying()
    var st = Student("Yohan")
    st.learing()

}