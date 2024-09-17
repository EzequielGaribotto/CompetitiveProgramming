import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    // Partidos para la quiniela
    val partidos:Int = scan.nextInt()
    var golesLocal:Int // Valores de los goles que definiran quien gana
    var golesVisitante:Int
    repeat(partidos) {
    // Asignamos valores a los goles
        golesLocal = scan.nextInt()
        golesVisitante = scan.nextInt()
        // Comprobamos quien gana la quiniela o si hay empate
        // Imprimimos por pantalla
        if (golesLocal > golesVisitante) {
            println("1")
        } else if (golesVisitante > golesLocal) {
            println("2")
        } else {
            println("X")
        }
    }
}