import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que sera el numero de veces que se introducira un numero para factorizar
    val repeticiones:Int = scan.nextInt()
    var factorial:Long
    // Iniciamos el bucle
    repeat(repeticiones) {
        // Inicializamos y preguntamos la variable entera "numero_a_factorizar" que sera el numero que tendremos que factorizar
        var numero_a_factorizar:Int = scan.nextInt()
        numero_a_factorizar.toLong()
        if (numero_a_factorizar == 0 || numero_a_factorizar == 1) {
            factorial = 1
        } else {
            factorial = 1
            while(numero_a_factorizar > 0) {
                factorial = factorial * numero_a_factorizar
                --numero_a_factorizar
            }
        }
        println(factorial)
    }
}