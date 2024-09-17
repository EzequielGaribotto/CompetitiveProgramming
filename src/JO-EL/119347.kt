import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        scan.nextLine()
        val palabras = scan.nextLine().lowercase()
        val capacidad = scan.nextInt()
        var lalafelsCounter = 0
        var telaranyasCounter = 0
        var telaranyasLlenas = 0
        for (palabra in palabras.split(", ")) { // Contamos palabras
            when (palabra) {
                "lalafel" -> lalafelsCounter++
                "telaranya" -> telaranyasCounter++
                "aranya" -> {
                    lalafelsCounter = 0
                    telaranyasCounter = 0
                }
            }
        }
        while (lalafelsCounter >= capacidad && telaranyasCounter > 0 && capacidad > 0) {
            telaranyasLlenas++
            telaranyasCounter--
            lalafelsCounter -= capacidad
        }
        println("Hay $telaranyasLlenas telaranyas llenas.")
    }
}