import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Las tiradas de dados siempre serán 4
    val tiradasDeDado = 3

    // La posicion maxima del tablero siempre será 8
    val posVictoria = 8

    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {
        // Definimos el array de numeros
        val tablero = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3)
        val posInicial = scan.nextInt()
        var tirada:Int
        var casilla = posInicial
        var meta = false

        /**
        Iniciamos el bucle for que determinará la posición final despues de tres tiradas de dados
        Por cada iteración del bucle se dará valor a una tirda de dado, ese valor se sumará a la variable "casilla"

        La casilla será la correspondiente a la posición del tablero determinada de la suma de la casilla (posicion actual)
         y la tirada del turno
         **/

        repeat(tiradasDeDado) {
            tirada = scan.nextInt()
            casilla = tablero[casilla+tirada]
            if (casilla == posVictoria) meta = true
        }
        if (meta) println("8")
        else println(casilla)
    }
}