import java.util.*
// Problema: Dadas N listas de miembros de un grupo musical, debemos formar un acronimo para estos, las listas contendrán
// comas e ies, además de poder contener nombres compuestos como por ejemplo "Carles Pi i Maragall".

fun main() {
    val scan = Scanner(System.`in`,"UTF-8").useLocale(Locale.ENGLISH)
    val repeticiones = scan.nextInt()
    // Consumimos la linea del int
    scan.nextLine()

    // Habra N listas de miembros de grupos musicales
    repeat(repeticiones) {

        // Leemos la lista de miembros del grupo
        var miembrosGrupo = scan.nextLine()

        // Definimos un array mutable de enteros, que almacenará las posiciones de las ies
        val arrayDeIes = mutableListOf<Int>()

        // Iniciamos el for para almacenar las posiciones de las ies

        for (posicion in 1 until miembrosGrupo.length-1) {

            // Con cuidado, debemos verificar que la i se trate de una conjuncion y no una letra,
            // para esto añadimos la condicion de que su siguiente posicion ha de ser un espacio
            if (miembrosGrupo[posicion] == 'i' && miembrosGrupo[posicion+1] == ' ' && miembrosGrupo[posicion-1] == ' ') {
                arrayDeIes.add(posicion)
            }
        }

        if (arrayDeIes.size>0) {
            // Una vez salimos del for, ordenamos el array de ies de manera ascendente
            arrayDeIes.sort()
            // Nos hemos asegurado en los pasos previos de que la ultima "i"
            // será efectivamente la ultima separacion de nombres
            val ultimaI = arrayDeIes[arrayDeIes.size - 1]
            // Ahora solo nos faltaría utilizar la posicion de la ultima i para sustituirla por una coma

            // Para esto creamos dos substrings que no contengan la ulima i
            val miembrosGrupoSS1 = miembrosGrupo.substring(0, ultimaI)
            val miembrosGrupoSS2 = miembrosGrupo.substring(ultimaI + 1)

            // Y en el lugar donde estaba la i ponemos una coma
            miembrosGrupo = ("$miembrosGrupoSS1,$miembrosGrupoSS2")
            // Finalmente, por cada nombre de la lista dividida por comas imprimimos su inicial
            var comaCounter = 0
            for (letra in miembrosGrupo) {
                if (letra == ',')
                    comaCounter++
            }
            if (comaCounter in 1..14) {
                for (nombre in miembrosGrupo.split(", ")) {
                    print(when (nombre[0]) {
                            'À', 'Á' -> "A"
                            'È', 'É' -> "E"
                            'Ì', 'Í' -> "I"
                            'Ò', 'Ó' -> "O"
                            'Ù', 'Ú' -> "U"
                            else -> nombre[0].uppercase()
                        }
                    )
                }
            }
        }
        print("\n")
        // Apunte: este ejercicio no generaria las iniciales correctas para el caso: Carles Pi i Maragall, Bernat Català i Josep Ramon Pi i Maragall
    }
}