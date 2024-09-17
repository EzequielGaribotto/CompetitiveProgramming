import java.util.*

fun main() {
    // Definimos el escaner
    val scan = Scanner(System.`in`)
    // Inicializamos la variable accio y preguntamos la entrada al usuario
    var accio:String = scan.nextLine()
    // En funcion del input imprimimos una accion
    print(when (accio) {
        "Q" -> "Skill 1"
        "W" -> "Skill 2"
        "E" -> "Skill 3"
        "R" -> "Ultimate"
        "B" -> "Recall"
        "D" -> "Bronzes never use summoners"
        "F" -> "Bronzes never use summoners"
        else -> "Error"
    })
}