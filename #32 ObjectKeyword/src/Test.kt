
data class Book(var name : String, var price : Int)

object BookShelf{
    var books = arrayListOf<Book>() //array list

    fun showBooks(){
        for(i in books){
            println(i)

        }
    }

}


fun main(args:Array<String>){

    BookShelf.books.add(Book("java",60))
    BookShelf.books.add(Book("Sql",50))
    BookShelf.books.add(Book("kotlin",90))
    
    BookShelf.showBooks()

}