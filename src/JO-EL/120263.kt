import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine()
    repeat(repeticiones) {
        val numeros = scan.nextLine().split(" ")
        var encontrado = false
        for (i in 0 until 5) {
            var count = 0
            if (!encontrado) {
                for (j in 0 until 5) {
                    if (numeros[i] == numeros[j]) {
                        count++
                    }
                }
            }
            if (count >= 3) {
                encontrado = true
                print("${numeros[i]} ")
                println()
            }
        }
        if (!encontrado) {
            println("NO")
        }
    }
}