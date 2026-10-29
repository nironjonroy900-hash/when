
/*fun main(args: Array<String>) {

    println("enter the number : ")
    val teble = readln().toInt()
    var i = 0
    while (i<10) {
       i++
        println("$teble * $i = ${i*teble}")
    }

}

 */

/*fun main(args: Array<String>) {
   printHello()
}
fun printHello() {
    println("enter your frist number:")
    val  input = readln().toInt()
    println("enter your second number:")
    val int = readln().toInt()
    val i = input + int

    println(i)

}

 */
/*fun main(ares : Array<String>) {
    val atm = Atm()
    println(atm.balance)
    atm.deposit(amount = 500.00)
    println(atm.balance)
    atm.withdraw(amount = 100.00)
}
open class BankAccount {
    var balance : Double = 0.0
    fun deposit(amount : Double) {
        balance += amount
    }
    fun withdraw(amount : Double) {
        balance -= amount
        println(balance)
    }
}
class Atm: BankAccount() {


}
 */

fun main(ares : Array<String>) {
    val bikash = BikashAccount()
    println(bikash.balance)
    bikash.deposit(amount = 700.00)
    println(bikash.balance)
    bikash.withdraw(amount = 300.00)
}
open class BikashAccount{
    var balance : Double = 0.0
    fun deposit(amount: Double){
        balance += amount
    }
    fun withdraw(amount: Double){
        balance -= amount
        println(balance)
    }
}
class Bikash : BikashAccount(){

}