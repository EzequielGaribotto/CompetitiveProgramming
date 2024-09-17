import java.util.*

fun main() {
    // Definimos la variable escaner
    val scan = Scanner(System.`in`)
    // Inicializamos la variable que identificara la nota de un alumno
    var nota:Int = scan.nextInt()
    // Dependiendo de la nota del alumno, imprimiremos un mensaje distinto
    println(when (nota) {
        in 0..4 -> "Suspes"
        in 5..6 -> "Aprovat"
        in 7..8 -> "Notable"
        in 9..10 -> "Excelent"
        else -> "-1"
    })
}