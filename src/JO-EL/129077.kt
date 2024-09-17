import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()

    repeat(repeticiones) {
        val secuencia26Letras = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
        val secuencia26Numeros = IntArray(26)
        for (index in secuencia26Numeros.indices) {
            secuencia26Numeros[index] = scan.nextInt()
        }
        scan.nextLine()
        val arrayPalabras = mutableListOf<String>()
        var input = scan.nextLine().uppercase()

        while (input != ".") {
            arrayPalabras.add(input)
            input = scan.nextLine().uppercase()
        }
        var palabrasPosibles = 0
        var palabras = ""
        for (palabra in arrayPalabras) {
            val saveCountLetras = IntArray(palabra.length)
            var palabraImposible = false
            var letrasPosibles = 0
            var saveCountLetrasIndex = 0
            for (letra in palabra) {
                val indexLetras = secuencia26Letras.indexOf(letra)
                val countLetras = palabra.count { it == letra }
                if (!palabraImposible && countLetras <= secuencia26Numeros[indexLetras]) {
                    letrasPosibles++
                    saveCountLetras[saveCountLetrasIndex] = countLetras
                } else {
                    palabraImposible = true
                }
                saveCountLetrasIndex++
            }
            if (letrasPosibles == palabra.length) {
                palabrasPosibles++
                palabras += "$palabra "
                for (letra in secuencia26Letras.indices) {
                    val index = palabra.indexOf(secuencia26Letras[letra])
                    if (index != -1) {
                        secuencia26Numeros[letra] -= saveCountLetras[index]
                    }
                }
            }
        }
        println("$palabrasPosibles $palabras")
    }
}