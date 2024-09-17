import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine()

    repeat(repeticiones) {
        val palabras = scan.nextLine().lowercase()
        val capacidad = scan.nextInt()
        scan.nextLine()

        var lalafelsCounter = 0
        var telaranasCounter = 0
        var telaranasLlenas = 0

        for (palabra in palabras.split(", ")) {
            when (palabra) {
                "lalafel" -> lalafelsCounter++
                "telaranya" -> telaranasCounter++
                "aranya" -> { lalafelsCounter = 0
                              telaranasCounter = 0 }
            }
        }
        
        var n = 1;
        for (lalafels in 1..lalafelsCounter) {
            if (lalafels == capacidad*n) {
                telaranasLlenas++
                if (n+1 <= telaranasCounter) {
                    n++
                }
            }
        }
        println("Hay $telaranasLlenas telaranyas llenas.")
    }
}