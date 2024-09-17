import java.util.*
 /*
  Problema: Dadas N listas de miembros de un grupo musical, debemos formar un acronimo para estos, las listas contendrán
  comas e ies, además de poder contener nombres compuestos como por ejemplo "Carles Pi i Maragall"
  No es necesario generar iniciales correctas para el caso: Carles Pi i Maragall, Bernat Català i Josep Ramon Pi i Maragall
 */
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
        val arrayDeIes = mutableListOf<Int>()

        // Iniciamos el for para almacenar las posiciones de las ies
        for (posicion in 1 until miembrosGrupo.length-1) {
            if (miembrosGrupo[posicion] == 'I' && miembrosGrupo[posicion+1] == ' ' && miembrosGrupo[posicion-1] == ' ') {
                arrayDeIes.add(posicion)
            }
        }

        // Una vez salimos del for, ordenamos el array de ies de manera ascendente, y guardamos la posicion de la ultima I
        arrayDeIes.sort()
        val ultimaI = arrayDeIes[arrayDeIes.size - 1]

        // Sustituimos la i por una coma
        val miembrosGrupoSS1 = miembrosGrupo.substring(0, ultimaI)
        val miembrosGrupoSS2 = miembrosGrupo.substring(ultimaI + 1)
        miembrosGrupo = ("$miembrosGrupoSS1,$miembrosGrupoSS2")

        // Finalmente, por cada nombre de la lista dividida por comas imprimimos su inicial
        for (nombre in miembrosGrupo.split(", ")) {
            print(when (nombre[0]) {
                    'À', 'Á' -> "A"
                    'È', 'É' -> "E"
                    'Ì', 'Í' -> "I"
                    'Ò', 'Ó' -> "O"
                    'Ù', 'Ú' -> "U"
                    else -> nombre[0]
                }
            )
        }
        println("")
    }
}