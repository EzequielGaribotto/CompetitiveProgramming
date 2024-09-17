import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que sera el numero de veces que se introducira un numero para factorizar
    val repeticiones:Int = scan.nextInt()
    // El factorial tendra que ser long para poder representar mas factoriles
    var factorial:Long
    // Iniciamos el bucle que se repetira por cada input del usuario
    repeat(repeticiones) {
        // Inicializamos y preguntamos la variable entera "numero_a_factorizar" que sera el numero que tendremos que factorizar
        var numero_a_factorizar:Int = scan.nextInt()
        // Si el numero es 0 o 1 el factorial será 1
        if (numero_a_factorizar == 0 || numero_a_factorizar == 1) {
            factorial = 1
        // Calculamos el factorial del numero 
        } else {
            factorial = 1
            while(numero_a_factorizar > 1) {
                factorial = factorial * numero_a_factorizar
                --numero_a_factorizar
            }
        }
        // Imprimimos por pantalla el numero factorial resultante
        println(factorial)
    }
}