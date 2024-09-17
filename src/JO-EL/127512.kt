import java.util.*

// Problema: Dadas N listas de miembros de un grupo musical, debemos formar un acronimo para estos, las listas contendrán
// comas e ies, además de poder contener nombres compuestos como por ejemplo "Carles Pi i Maragall".

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del int
    scan.nextLine()

    // Habra N listas de miembros de grupos musicales
    repeat(repeticiones) {
        // Leemos la lista de miembros del grupo
        var miembrosGrupo = scan.nextLine().uppercase()

        // Definimos un array mutable de enteros, que almacenará las posiciones de las ies
        var ultimaI = 0
        // Iniciamos el for para almacenar la posicion de la I
        for (i in miembrosGrupo.length-2 downTo 1 ) {
            if (miembrosGrupo[i] == 'I' && miembrosGrupo[i+1] == ' ' && miembrosGrupo[i-1] == ' ' && ultimaI <= 0) {
                ultimaI = i
            }
        }
        // Sustituimos la ultima I por una coma
        miembrosGrupo = ("${miembrosGrupo.substring(0, ultimaI - 1)},${miembrosGrupo.substring(ultimaI + 1)}")

        // Finalmente, por cada nombre de la lista dividida por comas imprimimos su inicial
        for (nombre in miembrosGrupo.split(", ")) {
            print(when (nombre[0]) {
                'À', 'Á' -> "A"
                'È', 'É' -> "E"
                'Ì', 'Í' -> "I"
                'Ò', 'Ó' -> "O"
                'Ù', 'Ú' -> "U"
                    else -> nombre[0]})
        }
        println("")
    }
}