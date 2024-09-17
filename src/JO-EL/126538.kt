import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Las tiradas de dados siempre serán 4
    val tiradasDeDado = 4
    
    // La posicion maxima del tablero siempre será 8
    val posVictoria = 8
    
    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {
        // Definimos el array de numeros
        val secuenciaArray = arrayOfNulls<Int>(tiradasDeDado)
        var posicionFinal = 0
        var posicion = 0

       /**
        Iniciamos el bucle for que determinará la posición final despues de cuatro tiradas de dados
        Por cada iteración del bucle se dará valor a una tirda de dado, ese alor se sumará a la variable "posicion"

        A lo largo del bucle se hacen operaciones dependiendo del caso, el resultado de estas operaciones se almacena
        en "posicionFinal", esta variable, una vez finalice el bucle, será la impresa en pantalla como posición final,
        pero durante el bucle puede recibir distintos valores.
       **/

        for (tirada in 0 until tiradasDeDado) {
            secuenciaArray[tirada] = scan.nextInt()
            posicion += secuenciaArray[tirada]!!
            if (posicion == posVictoria) {
                posicionFinal = posVictoria
            } else if (posicionFinal != posVictoria) {
                if (posicion > posVictoria) {
                    val rebote = posicion - posVictoria
                    posicionFinal = posVictoria - rebote
                } else {
                    posicionFinal = posicion
                }
            }
            posicion = posicionFinal
        }
        println(posicionFinal)
    }
}