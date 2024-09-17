import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val segundos:Long = scan.nextLong() // Esperamos la respuesta del usuario
    var dia:Long = 1 // El juego inicia en el dia 1
    var momentoDia:String // Inicializamos variable para el bloque del if y else
    dia = dia + (segundos / (86400)) // Calculamos el día en el que estamos
    if ((segundos % (86400)) < 43200) { // 86400 = segundos de un día y 43200 de medio dia
        momentoDia = "mati"
    } else {
        momentoDia = "nit"
    }
    println("$momentoDia del dia $dia")
}