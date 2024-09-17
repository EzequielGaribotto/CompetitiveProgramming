import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    // Inicializamos las variables que usaremos para calcular el dia en el que logra salir el caracol del pozo
    var profundidad:Int
    var metrosSube:Int
    var metrosCae:Int
    var diasCounter:Int
    // Iniciamos el bucle que se repetira tantas veces como indique el usuario
    repeat(repeticiones) {
        profundidad = scan.nextInt()
        metrosSube = scan.nextInt()
        metrosCae = scan.nextInt()
        diasCounter = 0
        // Si los metros que cae por noche son superiores o iguales a los que sube por dia, y si la profundidad es superior a los metros que sube, será imposible que el caracol suba
        if ((metrosSube <= metrosCae) && (profundidad > metrosSube)) {
            println("NO")
        // En caso contrario, si será capaz de subir, por muchos dias que pueda tardar
        } else while (profundidad > 0) {
            // Calculamos la profundidad a lo largo del día
            profundidad -= metrosSube // de día
            diasCounter++
            if (profundidad <= 0) {
                // Si logra salir, se imprimen los dias que tardó por pantalla
                println(diasCounter)
            } else {
                profundidad += metrosCae // de noche
            }
        }
    }
}