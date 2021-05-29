fun main() {

   listOfBook(mutableListOf(Book("Born a crime", "Trevor Noah","45")))
    var currentaccounts= Currentaccount("3453443","mutoni",45645.89)
    currentaccounts.deposit(76876.7)
    currentaccounts.withdraw(8988.9)
    currentaccounts.details("546",6575,"jide")
     var savingsAccount=SavingsAccount(78676)
    savingsAccount.withdraw(9886.0)
    savingsAccount.withdrawals


}


data class Book(var title:String,var Author:String, var pages:String )

fun listOfBook(book:MutableList<Book>){
    var booksy= mutableListOf<String>("Born a crime", "Trevor Noah","45")
    var books=book.sortedBy { book->book.title }
    print(book)

}

fun numbers(){

   var squares=0
    do {
        print(num)
    }
        while (squares<300)
        squares--

}

open class Currentaccount( var accountNumber:String, var accountName:String, var balance:Double){
   open fun deposit(amount: Double){
        var depositamount=0
        balance+=depositamount
    }
   open fun withdraw(amount: Double){
        var withdrawmount=0
        balance-=withdrawmount
    }
  open fun details(x:String,y:Int,z:String){
       println("“Account number $x with balance $y is operated by $z”")
   }
}

class SavingsAccount(var accountNumber:Int, var accountName:String, var balance:Int,var withdrawals:Int){
    fun deposit(amount:Double){
        var amount=balance+amount
        println(amount)
    }
    fun withdraw(amount: Double){
        if (withdrawals<4){
            var amount=balance-amount
            println(amount)
            withdrawals++
        }
    }
    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }
}
