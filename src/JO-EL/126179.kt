import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    // En el final de la partida, siempre tendremos 7 cartas
    val cartasFinalPartida = 7;

    // Definimos el array de cartas
    var cartasArray = arrayOfNulls<Int>(cartasFinalPartida)

    // Valores para determinar si es escala real
    val just10 = 10;
    val jack = 11;
    val reina = 12;
    val rey = 13;
    val asCarta = 1;

    // Repetimos el bucle tantas veces como indique el usuario
    val repeticiones = scan.nextInt()

    repeat(repeticiones) {
        // Re/Inicimos las booleanas que determinarán si se compone una escala real
        var hayAs = false;
        var hayRey = false;
        var hayReina = false;
        var hayJack = false;
        var hayJust10 = false;

        // Comprbamos si es una escala real o no, si al final del bucle for se encuentran todas las cartas, será real.
        for (carta in 0 until cartasFinalPartida) {
            cartasArray[carta] = scan.nextInt()
            when (cartasArray[carta]) {
                just10 -> hayJust10 = true
                jack -> hayJack = true
                reina -> hayReina = true
                rey -> hayRey = true
                asCarta -> hayAs = true
            }
        }

        // Ordenamos el array de manera ascendente
        cartasArray.sort()

        // Recorremos el array para contar las cartas consecutivas que tenemos en nuestra mano
        var consecutivasCounter = 1;
        var cartaAnterior = cartasArray[0]
        for (carta in 0 until  cartasFinalPartida-1) {
            if ((cartaAnterior!!+1 == (cartasArray[carta+1]))) {
                cartaAnterior = (cartasArray[carta+1])
                consecutivasCounter++
            }
        }

        // Imprimimos mensaje por pantalla en función de nuestros resultados
        if (hayJust10 && hayJack && hayReina && hayRey && hayAs) println("ESCALA REIAL")
        else if (consecutivasCounter >= 5) println("ESCALA")
        else println("NO")
    }
}