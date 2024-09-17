import java.util.*

// Problema: juego de ahorcado, output debe ser letras acertadas o asterirsco en su defecto, seguido de un espacio y la
// cantidad de intentos fallados.

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()

    // Consumimos la linea del Int
    scan.nextLine()
    repeat(repeticiones) {

        // Escaneamos dos lineas, la palabra a adivinar y los intentos (letras)
        val palabraAdivinar = scan.nextLine()
        val intentos = scan.nextLine().split(" ")

        /*
        En este for imprimimos las letras o los asteriscos,
        Para eso recorremos las letras de la palabra a adivinar
        y miramos si las letras están en los intentos.
         */

        for (letra in palabraAdivinar) {
            if (letra in intentos.toString())
                 print(letra)
            else print("*")
        }

        /*
        En este for contamos la cantidad de fallos,
        Para eso recorremos las letras de los intentos,
        si el intento no está en la palabra a adivinar,
        sumamos un intento fallido.
         */

        var intentosFallados = 0
        for (intento in intentos) {
            if (intento !in palabraAdivinar) intentosFallados++
        }
        print(" $intentosFallados\n")
    }
}