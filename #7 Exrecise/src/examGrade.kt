fun main(args : Array<String>){
   // var mark : Int = 47


    var s : Exam = Exam(67);
    if(s.mark>75)
        println("Grade A")
    else if(s.mark>65)
        println("Grade B")
    else if(s.mark>50)
        println("Grade C")
    else if(s.mark>40)
        println("Grade S")
    else
        println("you Fail Exam")

}