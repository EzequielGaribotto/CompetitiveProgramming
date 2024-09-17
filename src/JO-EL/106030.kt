import java.util.*
fun main() {
    val scan = Scanner(System.`in`) // Definimos el escaner
    var votosJiden:Int = scan.nextInt() // Inicializamos variables
    var votosDrump:Int = scan.nextInt()
    // Determinamos quien es el mas votado para imprimir su apellido, si hay empate se imprime "No"
    if (votosJiden > votosDrump) {
        println("Jiden")
    } else if (votosJiden < votosDrump) {
        println("Drump")
    } else {
        println("No")
    }
}