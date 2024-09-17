import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    var repeticiones:Int = scan.nextInt()
    repeat(repeticiones) {
        var cartasBambino:Int = scan.nextInt()
        var altura:Int = 0
        var cartasUsadas:Int = 0
        var cartasRestantes:Int
        for (dos in 2..cartasBambino step 2) {
            if (dos <= (cartasBambino - cartasUsadas)) {
                altura++
                cartasUsadas += dos+altura
            }
        }
        cartasUsadas -= altura
        cartasRestantes = cartasBambino - cartasUsadas
        println("$altura $cartasRestantes")
    }
}