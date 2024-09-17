import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        // Asignamos una cantidad de numeros determinada por el usuario en un array,
        val cantidadNumeros = scan.nextInt()
        val numerosArray = IntArray(cantidadNumeros)
        for (index in 0 until cantidadNumeros) {
            numerosArray[index] = scan.nextInt()
        }
        
        // Pedimos al usuario un numero
        val match = scan.nextInt()
        var matches = 0

        // Recorremos el array en busqueda de numeros que coincidan con posiciones del array
        for (index in 0 until cantidadNumeros) {
            if (numerosArray[index] == match) {
                // Si coincidien, aumentamos el contador de matches
                matches++ 
            }
        }
        // Finalmente imprimimos el contador de matches
        println(matches) 
    }
}