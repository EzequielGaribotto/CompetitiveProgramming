import java.util.*
fun main() {
    //Definir el escaner
    val scan = Scanner(System.`in`)
    //Escanear la respuesta de usuario
    var important_per_tu:String = scan.nextLine()
    //Escoger la casa del usuario en funcion de su respuesta
    var resultat = when (important_per_tu) {
        "Coratge" -> "Gryffindor"
        "Coneixement" -> "Ravenclaw"
        "Ambicio" -> "Slytherin"
        else -> "Hufflepuff"
    }
    println(resultat)
}