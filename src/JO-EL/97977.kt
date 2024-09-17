import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var anyo_nacimiento:Int = scan.nextInt() // Preguntamos el año de nacimiento al usuario
    if (anyo_nacimiento < 1966 && anyo_nacimiento > 1944) { // Imprimimos respuesta en funcion de su año de nacimiento
        println("ok boomer")
    } else {
        println("nah")
    }
}