import java.util.*
fun main() {
    val scan = Scanner(System.`in`) // Definimos el escaner
    var votos_jiden:Int = scan.nextInt() // Inicializamos variables
    var votos_drump:Int = scan.nextInt()
    // Determinamos quien es el mas votado para imprimir su apellido, si hay empate se imprime "No"
    if (votos_jiden > votos_drump) {
        println("Jiden")
    } else if (votos_jiden < votos_drump) {
        println("Drump")
    } else {
        println("No")
    }
}