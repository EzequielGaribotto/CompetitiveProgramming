import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // La cantidad de numeros siempre será 4
    val cantidadNumeros = 4
    // La posicion maxima del tablero siempre será 8
    val posicionMaximaTablero = 8
    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {

        // Definimos el array de numeros
        val secuenciaArray = arrayOfNulls<Int>(cantidadNumeros)

        // Ocupamos todos los indices del array con numeros enteros
        for (numero in 0 until cantidadNumeros) {
            secuenciaArray[numero] = scan.nextInt()
        }

                                            /***
        Iniciamos el bucle for que determinará la posición final despues de tres tiradas de dados
                                            ***/

        var posicionFinal = 0
        var sumaDeTiradas = 0
        for (indice in 0 until cantidadNumeros) {
            sumaDeTiradas += secuenciaArray[indice]!!
            if (sumaDeTiradas == posicionMaximaTablero) {
                posicionFinal = posicionMaximaTablero
            } else if (sumaDeTiradas > posicionMaximaTablero && posicionFinal != 8) {
                val resta = sumaDeTiradas - posicionMaximaTablero
                posicionFinal =  posicionMaximaTablero - resta
            } else {
                if (posicionFinal != 8) {
                    posicionFinal = sumaDeTiradas
                }
            }
            sumaDeTiradas = posicionFinal
        }
        println(posicionFinal)
    }
}