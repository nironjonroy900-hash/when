/*fun .main() {
    print("enter frist number:")
    val a = readln().toInt()
    print("enter second number:")
    val b = readln().toInt()
    print("enter operator: + - * /: ")
    val operator = readln()
    when (operator) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> if (b == 0) {
            println("divide by 0 not possible")
        } else {
            println(a / b)
        }
else -> println("invalid")
    }
}
 */
/*fun .main() {
    for (i in 10 downTo 2 step 2 ){
        println(i)
    }
}
 */
/*fun .main() {

    var sum = 0
    for (i in 1 ..5){
        if (i%2 == 0){
            sum += i
        }
    }
    println(sum)
}

 */
/*fun .main() {
    var sum = 0
    for(i in 0 ..20){
        if (i%2 == 0){
            sum += i
        }
    }
    println(sum)
}

 */

fun main() {

    val morsalin = Studentt()
    morsalin.id=1
    morsalin.name = "Morsalin"
    morsalin.age = 20
    morsalin.showDetails()
    println("-------------")
    val nazmul = Studentt()
    nazmul.id=2
    nazmul.name = "Nazmul"
    nazmul.age = 21
    nazmul.showDetails()

}
class Studentt(){

    var id :Int = 0
    var name :String = ""
    var age :Int = 0
    fun showDetails(){
        println("id : $id")
        println("Name: $name")
        println("Age: $age")

    }
}