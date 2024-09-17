import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var votosJiden:Int = scan.nextInt()
    var votosDrump:Int = scan.nextInt()
    var votosBanders:Int = scan.nextInt()
    // Caso gana Jiden
    if (votosJiden > votosDrump && votosJiden > votosBanders) {
        println("Jiden")
    // Caso gana Drump
    } else if (votosJiden < votosDrump && votosBanders < votosDrump) {
        println("Drump")
    // Si no es ni Jiden ni Drump, será Banders
    } else {
        println("Banders")
    }
}