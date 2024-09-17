import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val segundos:Long = scan.nextLong() // Esperamos la respuesta del usuario
    var dia:Long = 1+(segundos / (86400)) // Calculamos el día en el que estamos (el juego inicia en el dia 1)
    if ((segundos % (86400)) < 43200) { // 86400 = segundos de un día y 43200 de medio dia
        println("mati del dia $dia")
    } else {
        println("nit del dia $dia")
    }
}