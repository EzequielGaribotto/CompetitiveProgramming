import java.util.*
import kotlin.math.max

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    val cartasFinalPartida = 7;
    // Valores y booleanas para calcular si es escala real
    val just10 = 10;
    val jack = 11;
    val reina = 12;
    val rey = 13;
    val asCarta = 1;

    repeat(repeticiones) {
        var cartasArray = arrayOfNulls<Int>(cartasFinalPartida)
        var esEscala = false;
        var hayAs = false;
        var hayRey = false;
        var hayReina = false;
        var hayJack = false;
        var hayJust10 = false;
        // Leemos las cartas del usuario
        for (carta in 0 until cartasFinalPartida) {
            cartasArray[carta] = scan.nextInt()
        }
        // Ordenamos el array
        cartasArray.sort()
        var cartasCounter = 1;
        var cartaAnterior = cartasArray[0]
        for (carta in 0 until  cartasFinalPartida-1) {
            if ((cartaAnterior!!+1 == (cartasArray[carta+1]))) {
                cartaAnterior = (cartasArray[carta+1])
                cartasCounter++
                if (cartasCounter == 5) {
                    esEscala = true;
                }
            }
        }
        for (carta in cartasArray.indices) {
            when (cartasArray[carta]) {
                just10 -> hayJust10 = true
                jack -> hayJack = true
                reina -> hayReina = true
                rey -> hayRey = true
                asCarta -> hayAs = true
            }
        }
        if (hayJust10 && hayJack && hayReina && hayRey && hayAs) {
            println("ESCALA REIAL")
        } else if (esEscala) {
            println("ESCALA")
        } else {
            println("NO")
        }
    }
}