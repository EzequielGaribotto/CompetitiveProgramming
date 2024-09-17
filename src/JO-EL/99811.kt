import java.util.*
fun main() {
    // Definir escaner e inicializar variables
    val scan = Scanner(System.`in`)
    var juego_1:Int = scan.nextInt()
    var juego_2:Int = scan.nextInt()
    // Caso de error
    if (((juego_1 > 3) || (juego_1 < 1)) || ((juego_2 > 3) || (juego_2 < 1))) {
        println("ERROR")
    // Caso de empate
    } else if (juego_1 == juego_2) {
        println("EMPAT") 
    // Casos de victorias
    } else if (juego_1 == 1) {
        if (juego_2 == 2) {
            println("Jugador2")}; 
        if (juego_2 == 3) {
            println("Jugador1")
        }
    } else if (juego_1 == 2) {
        if (juego_2 == 1) {
            println("Jugador1")};
        if (juego_2 == 3) {
            println("Jugador2")
        }
    } else if (juego_1 == 3) {
        if (juego_2 == 1) {
            println("Jugador2")}; 
        if (juego_2 == 2) {
            println("Jugador1")
        }
    }
}