import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val repeticiones = scan.nextInt()
    // El bucle se repetirá tantas veces como indique el usuario
    repeat(repeticiones) {
        // Escaneamos la cantidad de lineas a ser leidas
        val numeroLineas = scan.nextInt()

        // Consumimos la linea del Int
        scan.nextLine()

        // Asignamos un tamañp al array de animales y lo recorremos para asignarle strings
        val numeroAnimales = numeroLineas-1
        val animalesArray = arrayOfNulls<String>(numeroAnimales)
        for (animal in 0 until numeroAnimales) {
            animalesArray[animal] = scan.nextLine()
        }

        // Finalmente, escaneamos el animal buscado
        val animalBuscado = scan.nextLine()

        // Y miramos si se encuentra en el array de animales, imprimimos una respuesta en funcion del resultado.
        println(if (animalBuscado in animalesArray) "SI" else "NO")
    }
}