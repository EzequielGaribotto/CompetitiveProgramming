import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var anyoNacimiento:Int = scan.nextInt() // Preguntamos el año de nacimiento al usuario
    if (anyoNacimiento < 1966 && anyoNacimiento > 1944) { // Imprimimos respuesta en funcion de su año de nacimiento
        println("ok boomer")
    } else {
        println("nah")
    }
}