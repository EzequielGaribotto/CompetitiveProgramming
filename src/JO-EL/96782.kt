import java.util.*
fun main() {
    //Definir el escaner
    val scan = Scanner(System.`in`)
    //Escanear la respuesta de usuario
    var important_per_tu:String = scan.nextLine()
    //Escoger la casa del usuario en funcion de su respuesta
    if (important_per_tu == "Coratge") println("Gryffindor")
    else if (important_per_tu == "Coneixement") println("Ravenclaw")
    else if (important_per_tu == "Ambicio") println("Slytherin")
    else println("Hufflepuff")
}