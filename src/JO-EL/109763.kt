import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    // Partidos para la quiniela
    val partidos:Int = scan.nextInt()
    var golesLocal:Int // Valores de los goles que definiran quien gana
    var golesVisitante:Int
    var resultado:String
    repeat(partidos) {
        // Asignamos valores a los goles
        golesLocal = scan.nextInt()
        golesVisitante = scan.nextInt()
        // Comprobamos quien gana la quiniela o si hay empate
        // Imprimimos por pantalla
        resultado = if (golesLocal > golesVisitante) {
            "1"
        } else if (golesVisitante > golesLocal) {
            "2"
        } else {
            "X"
        }
        println(resultado)
    }
}