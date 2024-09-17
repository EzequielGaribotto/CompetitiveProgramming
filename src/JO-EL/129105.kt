import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    val letrasAbecedario = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    val letrasCantidad = IntArray(26)
    repeat(repeticiones) {
        for (letra in letrasCantidad.indices) {
            letrasCantidad[letra] = scan.nextInt()
        }
        
        var palabrasPosibles = 0
        var palabras = ""
        
        scan.nextLine()
        var palabra = scan.nextLine().uppercase()
        while (palabra != ".") {
            val countLetras = IntArray(palabra.length)
            var palabraImposible = false
            var letrasPosibles = 0
            var letrasIndex = 0
            for (letra in palabra) {
                val indexLetra = letrasAbecedario.indexOf(letra)
                val letras = palabra.count { it == letra }
                if (!palabraImposible && letras <= letrasCantidad[indexLetra]) {
                    letrasPosibles++
                    countLetras[letrasIndex] = letras
                } else {
                    palabraImposible = true
                }
                letrasIndex++
            }
            if (letrasPosibles == palabra.length) {
                palabrasPosibles++
                palabras += "$palabra "
                for (letra in letrasAbecedario.indices) {
                    val index = palabra.indexOf(letrasAbecedario[letra])
                    if (index != -1) {
                        letrasCantidad[letra] -= countLetras[index]
                    }
                }
            }
            palabra = scan.nextLine().uppercase()
        }
        println("$palabrasPosibles $palabras")
    }
}