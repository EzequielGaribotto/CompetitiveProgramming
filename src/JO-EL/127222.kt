import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del Int
    scan.nextLine()
    repeat(repeticiones) {
        val palabraAdivinar = scan.nextLine()
        val intentos = scan.nextLine().split(" ")
        var intentosFallados = 0
        for (letra in palabraAdivinar) {
            if (letra in intentos.toString()) {
                print(letra)
            } else {
                print("*")
            }
        }
        for (intento in intentos) {
            if (intento !in palabraAdivinar) {
                intentosFallados++
            }
        }
        print(" $intentosFallados")
        println("")
    }
}