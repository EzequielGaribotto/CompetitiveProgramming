import java.util.*

fun main() {
    // Definimos el scanner e inicializamos la variable diaAnio
    val scan = Scanner(System.`in`)
    var diaAnio = scan.nextInt()
    //En funcion del input del usuario imprimiremos un mes o -1 si no esta entre 1 y 365
    var mes = when (diaAnio) {
        in 1..31 -> 1
        in 32..59 -> 2
        in 60..90 -> 3
        in 91..120 -> 4
        in 121..151 -> 5
        in 152..181 -> 6
        in 182..212 -> 7 
        in 213..243 -> 8
        in 244..273 -> 9
        in 274..304 -> 10
        in 305..334 -> 11
        in 335..365 -> 12
        else -> -1 // No esta entre 1-365
    }
    println(mes)
}