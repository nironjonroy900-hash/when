
fun main(args: Array<String>) {
    val atm = BikashAccount()
    println(atm.balance)
    atm.deposit(10000.00)
    println(atm.balance)
    atm.withdraw(4000.00)
}
open class BankAccount {
    var balance: Double = 0.0
    fun deposit(amount: Double) {
        balance += amount
    }
    fun withdraw(amount: Double) {
        balance -= amount
        println(balance)
    }
}
class ATM() :BankAccount(){

}


//vehicle -> parent
//class bike -> Child,parent
//class car -> Child
//parent - Child
//super - sub
//Base - Derived