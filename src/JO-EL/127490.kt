import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()

    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {
        
        // Leemos el importe de Celia
        var importCelia = scan.nextInt()
        
        // Definimos un array de tamaño mutable (o variable) en el que se introduciran todas las solicitudes
        val solicitudesArray = mutableListOf<Int>()
        var solicitudes = 0
        
        // Introducimos las solicitudes (incluyendo el 0)
        do {
            solicitudesArray.add(scan.nextInt())
            solicitudes++
        } while (solicitudesArray[solicitudes-1] != 0)

        // Ordenamos el array de manera ascendente
        solicitudesArray.sort()

        // Contamos la cantidad de solicitudes que Celia puede satisfacer
        var solicitudesSatisfechas = 0
        for (solicitud in solicitudesArray) {
            // Si es posible la solicitud y no se trata del caso de cierre "0", se añade una solicitud satisfecha
            if ((importCelia - solicitud >= 0) && solicitud != 0) {
                importCelia -= solicitud
                solicitudesSatisfechas++
            }
        }
        // Imprimimos las solicitudes satisfechas por pantalla
        println("$solicitudesSatisfechas")
    }
}