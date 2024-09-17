import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que serán los casos de prueba
    var repeticiones:Int = scan.nextInt()
    // Inicializamos la variable presidentPatata que sera las veces que tendre que escribir la frase en la pizarra
    var presidentPatata:Int
    // Repetiremos el bucle la cantidad de casos de prueba introducidos por el usuario
    repeat(repeticiones) {
        // Preguntamos la variable presidentPatata al usuario
        presidentPatata = scan.nextInt()
        // Iniciamos el bucle de impresiones que terminará una vez presidentPatata sea inferior a 0
        while (presidentPatata > 0) {
            println("No ofendre al president patata")
            --presidentPatata
        }
        println("")
    }
}