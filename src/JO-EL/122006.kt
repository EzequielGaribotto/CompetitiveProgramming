import java.util.*

fun main() {
    // Definimos el scanner con caracteres en inglés para no tener problemas con el %
    val scan = Scanner(System.`in`).useLocale(Locale.ENGLISH)

    // Escaneamos el valor del tamaño del array de numeros decimales del 0 al 1
    val indexSize = scan.nextInt()
    val porcentajeDecimal = DoubleArray(indexSize)

    // Recorremos el array, multiplicamos por 100 cada indice y añadimos el simbolo de %, imprimimos
    for (index in 0 until indexSize) {
        porcentajeDecimal[index] = scan.nextDouble()
        print("${porcentajeDecimal[index] * 100.0}% ")
    }
}