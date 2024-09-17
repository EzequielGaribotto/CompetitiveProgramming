import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var muchoTexto:String = scan.nextLine()
    while (muchoTexto != "FIN") {
        var exclamIni:Int = 0
        var exclamFin:Int = 0
        for (caracter in 0 until muchoTexto.length) {
            when (muchoTexto[caracter]) {
                '!' -> exclamFin++
                '¡' -> exclamIni++
            }
        }
        if (exclamIni == exclamFin) {
            println("SI")
        } else {
            println("NO")
        }
        muchoTexto = scan.nextLine()
    }
}