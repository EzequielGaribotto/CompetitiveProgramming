import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var jugador1:Int = scan.nextInt()
    var jugador2:Int = scan.nextInt()
    var juego_1:String = when (jugador1) {
        1 -> "pedra"
        2 -> "paper"
        3 -> "tissores"
        else -> "ERROR"
    } 
    var juego_2:String = when (jugador2) {
        1 -> "pedra"
        2 -> "paper"
        3 -> "tissores"
        else -> "ERROR"
    }
    if ((juego_1 == "ERROR") || (juego_2 == "ERROR")) {
        println("ERROR")
    } else if (juego_1 == juego_2) {
        println("EMPAT") 
    } else if (juego_1 == "pedra") {
        if (juego_2 == "paper") {
            println("Jugador2")
        } else if (juego_2 == "tissores") {
            println("Jugador1")
        }
    } else if (juego_1 == "paper") {
        if (juego_2 == "pedra") {
            println("Jugador1")
        } else if (juego_2 == "tissores") {
            println("Jugador2")
        }
    } else if (juego_1 == "tissores") {
        if (juego_2 == "pedra") {
            println("Jugador2")
        } else if (juego_2 == "paper") {
            println("Jugador1")
        }
    }
}