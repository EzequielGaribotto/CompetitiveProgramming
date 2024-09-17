import java.util.*
fun main() {
    //Definir el escaner
    val scan = Scanner(System.`in`)
    //Escanear la respuesta de usuario
    var importantPerTu:String = scan.nextLine()
    //Escoger la casa del usuario en funcion de su respuesta
    var resultat = when (importantPerTu) {
        "Coratge" -> "Gryffindor"
        "Coneixement" -> "Ravenclaw"
        "Ambicio" -> "Slytherin"
        else -> "Hufflepuff"
    }
    println(resultat)
}