import java.util.*

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.ENGLISH)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        val numeroOpciones = scan.nextInt()
        val votos = IntArray(numeroOpciones)
        var ganador = 0
        var maxVotos = votos[0]
        for (opcion in 0 until numeroOpciones) {
            votos[opcion] = scan.nextInt()
            if (votos[opcion] >= maxVotos) {
                maxVotos = votos[opcion]
                ganador = opcion+1
            }
        }
        println(ganador)
    }
}