import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var votos_jiden:Int = scan.nextInt()
    var votos_drump:Int = scan.nextInt()
    var votos_banders:Int = scan.nextInt()
    // Caso gana Jiden
    if (votos_jiden > votos_drump && votos_jiden > votos_banders) {
        println("Jiden")
    // Caso gana Drump
    } else if (votos_jiden < votos_drump && votos_banders < votos_drump) {
        println("Drump")
    // Si no es ni Jiden ni Drump, será Banders
    } else {
        println("Banders")
    }
}