import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine()
    repeat(repeticiones) {
        val frase = scan.nextLine().split(" ")
        var palabraMasLarga = frase[0]
        for (palabra in frase) {
            if (palabra.length > palabraMasLarga.length) {
                palabraMasLarga = palabra
            }
        }
        println(palabraMasLarga.length)
    }
}