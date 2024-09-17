import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        // Escaneamos el tamaño del array y asignamos medidas de zapatos para cada indice
        val indexSize = scan.nextInt()
        val tamanyoZapato = IntArray(indexSize)
        for (index in 0 until indexSize) {
            tamanyoZapato[index] = scan.nextInt()
        }

        // Escaneamos el valor de mi medida de zapato
        val miMedida = scan.nextInt()

        // La respuesta inicialmente será que NO
        var zapatoEncontrado = "NO"

        // Recorremos el array en busca de una medida de zapato que se pueda adaptar a mi pie
        for (index in tamanyoZapato.indices) {
            if ((tamanyoZapato[index]) in miMedida-1..miMedida+1) {
                zapatoEncontrado = "SI"
            }
        }
        // Imprimimos respuesta
        println(zapatoEncontrado)
    }
}