import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    scan.nextLine()
    repeat(repeticiones) {
        val frase = scan.nextLine()
        val mitad = frase.length/2
        val primeraMitad = frase.substring(0, mitad+ if (frase.length %2 != 0) 1 else 0)
        val segundaMitad = frase.substring(mitad)
        var resposta= "SI"
        var repes1M = 0
        var repes2M = 0
        for (letra in segundaMitad) {
            if (resposta != "NO") {
                for (caracter in primeraMitad.indices) {
                    if (primeraMitad[caracter] == letra) {
                        repes1M++
                    }
                }
                for (caracter in segundaMitad.indices) {
                    if (segundaMitad[caracter] == letra) {
                        repes2M++
                    }
                }
            }
            if (repes2M != repes1M || repes2M == 0) {
                resposta = "NO"
            }
        }
        println(resposta)
    }
}