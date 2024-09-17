import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        var correcto = true;
        var cambiosCounter = 0;
        val numPalabras = scan.nextInt()
        val palabrasArray = arrayOfNulls<String>(numPalabras)
        scan.nextLine()
        for (palabra in 0 until numPalabras-1) {
            palabrasArray[palabra] = scan.nextLine()
            if ((palabra != 0) && (palabrasArray[palabra]!!.length != palabrasArray[palabra - 1]!!.length)) {
                correcto = false
            } else if ((palabra+1) % 2 == 0) {
                for (letra in 0 until palabrasArray[palabra]!!.length - 1) {
                    if (palabrasArray[palabra] != palabrasArray[palabra-1]) {
                        if (palabrasArray[palabra]!![letra] != palabrasArray[palabra - 1]!![letra]) {
                            cambiosCounter++
                            if (cambiosCounter != 1) {
                                correcto = false
                            }
                        }
                    } else {
                        correcto = false
                    }
                }
            }
        }
        println((if (!correcto) "IN" else "")+"CORRECTE")
        scan.nextLine()
    }
}