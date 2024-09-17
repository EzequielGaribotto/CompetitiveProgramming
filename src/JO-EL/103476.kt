import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que serán los casos de prueba
    var repeticiones:Int = scan.nextInt()
    // Inicializamos la variable president_patata que sera las veces que tendre que escribir la frase en la pizarra
    var president_patata:Int
    // Repetiremos el bucle la cantidad de casos de prueba introducidos por el usuario
    repeat(repeticiones) {
        // Preguntamos la variable president_patata al usuario
        president_patata = scan.nextInt()
        // Iniciamos el bucle de impresiones que terminará una vez president_patata sea inferior a 0
        while (president_patata > 0) {
            println("No ofendre al president patata")
            --president_patata
        }
        println("")
    }
}