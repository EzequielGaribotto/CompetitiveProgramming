import java.util.*

// Problema: dada una linea de texto con palabras, cambiar las B por V, b por v y vice-versa.

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del Int
    scan.nextLine()
    
    // Se escanearán tantas lineas de texto como el usuario indique
    repeat(repeticiones) {
        val lineaTexto = scan.nextLine()

        // Se imprimirá el caracter inverso o el mismo caracter dependiendo el caso.
        for (caracter in lineaTexto) {
            when (caracter) {
                'B' -> print('V')
                'b' -> print('v')
                'V' -> print('B')
                'v' -> print('b')
                else -> {print(caracter)}
            }
        }
        print("\n")
    }
}