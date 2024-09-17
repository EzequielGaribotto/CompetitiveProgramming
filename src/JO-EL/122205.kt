import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        // Asignamos una cantidad de numeros determinada por el usuario en un array
        val cantidadNumeros = scan.nextInt()
        val numerosArray = IntArray(cantidadNumeros)
        for (index in 0 until cantidadNumeros) {
            numerosArray[index] = scan.nextInt()
        }
        
        // Re/Iniciamos la variable "anterior" que inicialmente será la posicion 0
        var anterior = numerosArray[0]

        // Y "bloodborneLike" que será lo que imprimiremos
        var bloodborneLike = "NO"

        // Recorremos el array en busqueda de dos numeros iguales consecutivos
        for (index in 1 until cantidadNumeros) {
            if (numerosArray[index] == anterior) {
                bloodborneLike = "SI"
            }
            // De cara a la siguiente iteración este valor será el anterior
            anterior=numerosArray[index]
        }
        // Finalmente imprimimos por pantalla si el array es bloodborne-like o no
        println(bloodborneLike)
    }
}