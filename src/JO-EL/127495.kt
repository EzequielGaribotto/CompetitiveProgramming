import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    var importCelia:Int
    var solicitudes:Int
    var solicitudesSatisfechas:Int
    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {

        // Leemos el importe de Celia
        importCelia = scan.nextInt()

        // Iniciamos un array de tamaño mutable (o variable) en el que se introduciran todas las solicitudes
        val solicitudesArray = mutableListOf<Int>()
        solicitudes = 0

        // Introducimos las solicitudes (incluyendo el 0)
        do {
            solicitudesArray.add(scan.nextInt())
            solicitudes++
        } while (solicitudesArray[solicitudes-1] != 0)

        // Ordenamos el array de manera ascendente
        solicitudesArray.sort()

        // Contamos la cantidad de solicitudes que Celia puede satisfacer
        solicitudesSatisfechas = 0
        for (solicitud in solicitudesArray) {
            if (importCelia - solicitud >= 0) {
                importCelia -= solicitud
                solicitudesSatisfechas++
            }
        }
        // Imprimimos las solicitudes satisfechas por pantalla
        println("${solicitudesSatisfechas-1}") 
        // Donde el -1 corresponde a la solicitud final "0"
    }
}