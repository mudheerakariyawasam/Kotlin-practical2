import java.util.*

fun main() {

    var age=25
    //get user input
    println("Enter your age: ")
    val read = Scanner(System.`in`)
    age = read.nextInt()

    when (age) {
        in 1..17 -> println("You are a minor")
        in 18..64 -> println("You are an adult")
        else -> println("You are a senior citizen")
    }


}
