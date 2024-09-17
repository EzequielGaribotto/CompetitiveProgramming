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

        // Pedimos al usuario un numero (folio)
        val foli = scan.nextInt()
        var foliEncontrado = false

        // Recorremos el array en busqueda del folio
        for (index in 0 until cantidadNumeros) {
            if (numerosArray[index] == foli && !foliEncontrado) {
                // Si lo encontramos, imprimimos en qué posición está
                println(index)
                foliEncontrado = true
            }
        }
        
        // Si no ha sido encontrado, imprimimos -1
        if (!foliEncontrado) {
            println("-1")
        }
    }
}