import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt()
    val limiteSolicitudes = 100
    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(numCasos) {
        scan.nextLine()
        var importCelia = scan.nextInt()
        val solicitudesArray = mutableListOf<Int>()
        var solicitud = 0
        do {
            solicitudesArray.add(scan.nextInt())
            solicitud++
        } while (solicitud <= limiteSolicitudes && solicitudesArray[solicitud-1] != 0)

        solicitudesArray.sort()
        var solicitudesSatisfechas = 0
        for (indice in 0 until solicitudesArray.size) {
            if (importCelia - solicitudesArray[indice] >= 0) {
                importCelia -= solicitudesArray[indice]
                solicitudesSatisfechas++
            }
        }
        println("${solicitudesSatisfechas-1}")
    }
}