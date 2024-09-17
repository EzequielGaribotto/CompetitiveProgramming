import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine()

    repeat(repeticiones) {
        var frase = scan.nextLine()
        var palabrasCounter = 0 
        var isSpace = true 

        for (caracter in frase) {
            if (caracter.isWhitespace()) {
                if (!isSpace) {
                    palabrasCounter++
                }
                isSpace = true
            } else {
                isSpace = false
            }
        }
        if (!isSpace) {
            palabrasCounter++
        }

        println(palabrasCounter)
    }
}