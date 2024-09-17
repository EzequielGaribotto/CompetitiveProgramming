import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val indexSize = scan.nextInt()
    val porcentajeDecimal = DoubleArray(indexSize)

    for (index in 0 until indexSize) {
        val numero = scan.next()
        val numeroDecimal = numero.replace(',', '.').toDouble() // Reemplaza la coma por punto y convierte a Double
        porcentajeDecimal[index] = numeroDecimal
        print("${porcentajeDecimal[index] * 100.0}% ")
    }
}