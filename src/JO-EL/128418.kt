import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        var mismaLongitud = true;
        var consecIguales = true;
        var canvisCounter = 0;
        val numPalabras = scan.nextInt()
        val palabrasArray = arrayOfNulls<String>(numPalabras)
        scan.nextLine()
        for (palabra in 0 until numPalabras-1) {
            palabrasArray[palabra] = scan.nextLine()
            if (palabra != 0) {
                if (palabrasArray[palabra]!!.length != palabrasArray[palabra - 1]!!.length) {
                    mismaLongitud = false
                } else if ((palabra+1) % 2 == 0) {
                    for (letra in 0 until palabrasArray[palabra]!!.length - 1) {
                        if (palabrasArray[palabra] != palabrasArray[palabra-1]) {
                            if (palabrasArray[palabra]!![letra] != palabrasArray[palabra - 1]!![letra]) {
                                canvisCounter++
                                if (canvisCounter != 1) {
                                    consecIguales = false
                                }
                            }
                        } else {
                            consecIguales = false
                        }
                    }
                }
            }
        }
        if (mismaLongitud && consecIguales) {
            println("CORRECTE")
        } else {
            println("INCORRECTE")
        }
        scan.nextLine()
    }
}