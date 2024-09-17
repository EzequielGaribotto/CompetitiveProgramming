import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // Se repetirá el bucle tantas veces como indique el usuario
    repeat(repeticiones) {

        // El usuario indica una cantidad de numeros para el array
        var cantidadNumeros = scan.nextInt()
        val secuenciaArray = arrayOfNulls<Int>(cantidadNumeros)

        // Ocupamos todos los indices del array con numeros enteros
        for (numero in 0 until cantidadNumeros) {
            secuenciaArray[numero] = scan.nextInt()
        }

        // Ordenamos el array de manera ascendente
        secuenciaArray.sort()

                                                /***
        Calculamos el numero pequeño del array que inicialmente será el indice 0, dada la ordenacion ascendente
        Y el numero grande, que será el último indice del array. (cantidadNumeros - 1 - indice), donde indice será 0.

        Para las siguientes iteraciones, el valor "indice" aumentará en una unidad, esto hará que recorramos
        el array en ambos sentidos al mismo tiempo, y dada la ordenación ascendente, tendremos los enesimos numeros
        más pequeños y más grandes
                                                ***/

        for (indice in 0 until cantidadNumeros/2) {
            val mesPetit = secuenciaArray[indice]!!
            val mesGran = secuenciaArray[cantidadNumeros-1-indice]!!
            print("${mesPetit + mesGran} ")
        }
        println("")
    }
}