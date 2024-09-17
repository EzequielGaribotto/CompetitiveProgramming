import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    repeat(repeticiones) {
        var cantidadNumeros = scan.nextInt()
        val secuenciaArray = arrayOfNulls<Int>(cantidadNumeros)
        for (carta in 0 until cantidadNumeros) {
            secuenciaArray[carta] = scan.nextInt()
        }
        secuenciaArray.sort()
        for (carta in 0 until cantidadNumeros/2) {
            val mesPetit = secuenciaArray[carta]!!
            val mesGran = secuenciaArray[cantidadNumeros-1-carta]!!
            print("${mesPetit + mesGran} ")
        }
        println("")
    }
}