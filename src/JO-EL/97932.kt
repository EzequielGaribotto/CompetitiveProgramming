import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var edad:Int = scan.nextInt() // Preguntamos la edad al usuario
    if (edad < 32) { // Imprimimos respuesta en funcion de su edad
        println("SI")
    } else {
        println("NO")
    }
}