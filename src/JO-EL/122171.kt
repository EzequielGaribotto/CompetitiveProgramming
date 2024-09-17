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
        // Pedimos al usuario un numero e imprimimos el numero al que corresponde en el array muliplicado por este
        val multiplicador = scan.nextInt()
        for (index in 0 until cantidadNumeros) {
            print("${numerosArray[index]*multiplicador} ")
        }
    }
}