import java.util.*

fun main() {
    println("Enter a Number")
    val read = Scanner(System.`in`)
    val number = read.nextInt()

    var sum=0
    var i=1
    while (i <= number){
        if(i%2==0) {
            sum += i
        }
        i++
    }

    println("The Sum of even numbers between 1 and $number is: $sum")
}
