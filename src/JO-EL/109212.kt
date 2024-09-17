import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    var cartasBambino:Int
    var alturaCounter:Int
    repeat(repeticiones) {
        cartasBambino = scan.nextInt()
        alturaCounter = 0
        for (dosCartas in 2..cartasBambino step 2) {
            if (cartasBambino >= dosCartas) {
                alturaCounter++
                cartasBambino -= (dosCartas+alturaCounter)
            }
        }
        cartasBambino += alturaCounter
        println("$alturaCounter $cartasBambino")
    }
}