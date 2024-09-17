import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    // Leemos el primer string
    var muchoTexto:String = scan.nextLine()
    // Iniciamos el bucle, parara cuando el usuario entre "FIN"
    while (muchoTexto != "FIN") {
        var exclamIni:Int = 0 // Asignamos valor 0 para cada iteracion
        var exclamFin:Int = 0
        // Por cada caracter en muchoTexto
        for (caracter in 0 until muchoTexto.length) {
            // Cuando el caracter
            when (muchoTexto[caracter]) {
                '¡' -> exclamIni++ // Sea exclamacion inicial
                '!' -> exclamFin++ // o final, se suma a la variable
            }
        }
        // Motramos si las exclamaciones estan bien puestas o no
        if (exclamIni == exclamFin) {
            println("SI")
        } else {
            println("NO")
        }
        // Leemos el siguiente string
        muchoTexto = scan.nextLine()
    }
}