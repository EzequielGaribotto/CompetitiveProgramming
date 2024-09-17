import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que hara que el primer bucle se repita esa cantidad de veces
    var repeticiones:Int = scan.nextInt()
    // Inicializamos las variables diasAnalisis, contagiosPorDia y estado
    var diasAnalisis:Int
    var contagiosPorDia:Int
    var estado:String = ""
    // El primer input "repeticiones" definira las veces que se repite el primer bucle
    repeat(repeticiones) {
        // Preguntamos un numero de dias para analizar al usuario
        diasAnalisis = scan.nextInt()
        // El input del usuario sera las veces que se repetira el bucle
        repeat(diasAnalisis) {
            // Preguntamos al usuario cuantos contagios ha habido en un dia por cada rep del bucle
            contagiosPorDia = scan.nextInt()
            // Si es igual o superior a 300 activamos la ALARMA
            if (contagiosPorDia >= 300) {
                estado = "ALARMA"
                // Sino, no
            } else if (estado != "ALARMA" ) {
                estado = "OK"
            }
        }
        // Mostramos el estado por pantalla
        println(estado)
        // Reiniciamos el estado para la siguiente repeticion
        estado = ""
    }
}