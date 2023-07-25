import java.util.*

fun main(args: Array<String>) {

    //get user input
    println("Enter a Number")
    val read = Scanner(System.`in`)
    val number = read.nextInt()

    //get factorial value from the method
    val factorial = printFactors(number)
    println("The factorial of $number is $factorial")
}

fun printFactors(input: Int) : Long{
    var factorial: Long = 1
    for (i in 1..input) {
        factorial *= i.toLong()
    }
    return factorial
}