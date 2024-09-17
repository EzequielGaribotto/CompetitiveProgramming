import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    // Inicializamos variables
    var cartasBambino:Int // Cartas de Bambino que se iran restando a lo largo del bucle
    var alturaCounter:Int // Contador de altura
    repeat(repeticiones) {
        // Asignamos valores a las variables
        cartasBambino = scan.nextInt()
        alturaCounter = 0
        // Por cada dos cartas de Bambino
        for (dosCartas in 2..cartasBambino step 2) {
            // Si hay mas cartas de Bambino que 2*n
            if (cartasBambino >= dosCartas) {
                // Sumamos al contador de altura
                alturaCounter++
                // Restamos a las cartas de Bambino las 2*n cartas y la altura (cartas horizontales necesarias)
                cartasBambino -= (dosCartas+alturaCounter)
            }
        }
        // Finalmente sumamos a las cartas de Bambino la altura que al mismo tiempo es la cantidad de cartas horizontales no necesarias
        cartasBambino += alturaCounter
        println("$alturaCounter $cartasBambino")
    }
}