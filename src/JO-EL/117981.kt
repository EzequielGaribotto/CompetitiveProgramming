import java.util.*
fun main () {
    val scan = Scanner(System.`in`)
    var frase = scan.nextLine()
    while (frase != "FI") {
        var letrasCounter = 0
        for (caracter in 0 until frase.length) {
            if ((frase[caracter] in 'a'..'z') || (frase[caracter] in 'A'..'Z')) {
                letrasCounter++
            }
        }
        print("$letrasCounter ")
        frase = scan.nextLine()
    }
}