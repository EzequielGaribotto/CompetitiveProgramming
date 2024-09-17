import java.util.*

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.ENGLISH)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        // Escaneamos el numero de patatas a votar y le asignamos un valor en el array
        val numeroOpciones = scan.nextInt()
        val votos = IntArray(numeroOpciones)
        
        // Re/Iniciamos los valores que definiran al ganador de las elecciones
        var ganador = 0
        var maxVotos = votos[0]
        
        // Recorremos el array de principio a fin para detemrinar la patata con mas votos
        for (opcion in 0 until numeroOpciones) {
            votos[opcion] = scan.nextInt()
            if (votos[opcion] >= maxVotos) {
                maxVotos = votos[opcion]
                ganador = opcion+1
            }
        }
        
        // Imprimimos el numero del ganador
        println(ganador)
    }
}