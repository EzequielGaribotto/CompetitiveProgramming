import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val segundos:Long = scan.nextLong() // Esperamos la respuesta del usuario
    var seg_dia:Long = 24*60*60 // 86400 = segundos de un día y 43200 de medio dia
    var seg_mediodia:Long = 12*60*60
    var dia:Long = 1+(segundos / (seg_dia)) // Calculamos el día en el que estamos (el juego inicia en el dia 1)
    if ((segundos % (seg_dia)) < seg_mediodia) { // Hacemos el modulo entre los segundos (input) y los segundos que dura un dia (86400)
        println("mati del dia $dia")             // Si el resultado es inferior a la mitad de un dia (43200) significa que estamos en el mati del dia 1
    } else {
        println("nit del dia $dia")
    }
}