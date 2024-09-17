import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var a:Int = scan.nextInt()
    var b:Int = scan.nextInt()
    if ((a+1 == b) || (b+1 == a))
        println("SI")
    else
        println("NO")
}