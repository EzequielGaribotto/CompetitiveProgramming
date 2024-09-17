import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var votos_jiden:Int = scan.nextInt()
    var votos_drump:Int = scan.nextInt()
    if (votos_jiden > votos_drump) {
        println("Jiden")
    } else if (votos_jiden < votos_drump) {
        println("Drump")
    } else {
        println("No")
    }
}