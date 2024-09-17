import java.util.*
fun main() {
    // Definir escaner e inicializar variables
    val scan = Scanner(System.`in`)
    var juego1:Int = scan.nextInt()
    var juego2:Int = scan.nextInt()
    // Caso de error
    if ((juego1 !in 1..3) || (juego2 !in 1..3)) {
        println("ERROR")
    // Caso de empate
    } else if (juego1 == juego2) {
        println("EMPAT")
    // Casos de victorias
    // pedra vs paper o tissores
    } else if (juego1 == 1) {
        if (juego2 == 2) {
            println("Jugador2")};
        if (juego2 == 3) {
            println("Jugador1")};
    // paper vs pedra o tissores
    } else if (juego1 == 2) {
        if (juego2 == 1) {
            println("Jugador1")};
        if (juego2 == 3) {
            println("Jugador2")};
    // tissores vs pedra o paper
    } else if (juego1 == 3) {
        if (juego2 == 1) {
            println("Jugador2")};
        if (juego2 == 2) {
            println("Jugador1")};
    }
}