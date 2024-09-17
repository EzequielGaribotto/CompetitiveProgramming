import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del Int
    scan.nextLine()
    repeat(repeticiones) {
        val palabraAdivinar = scan.nextLine()
        val intentos = scan.nextLine()
        var intentosFallados = 0
        for (letra in palabraAdivinar) {
            if (letra in intentos) {
                print(letra)
            } else {
                print("*")
            }
        }
        for (intento in intentos.split(" ")) {
            if (intento !in palabraAdivinar) {
                intentosFallados++
            }
        }
        print(" $intentosFallados")
        println("")
    }
}